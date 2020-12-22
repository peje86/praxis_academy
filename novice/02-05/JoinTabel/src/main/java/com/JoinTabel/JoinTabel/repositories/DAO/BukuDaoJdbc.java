package com.JoinTabel.JoinTabel.repositories.DAO;
 
import com.JoinTabel.JoinTabel.model.Buku;
import com.JoinTabel.JoinTabel.model.Kategori;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author Agung Setiawan
 */
public class BukuDaoJdbc {
    Connection connection;
    List<Buku> daftarBuku=new ArrayList<Buku>();
    
    public BukuDaoJdbc(Connection connection){
        this.connection=connection;
    }
    
    public List<Buku> getAll() throws SQLException{
        PreparedStatement ps=connection.prepareStatement(
                "SELECT buku.id,buku.judul,buku.penulis,kategori.id as id_kategori, kategori.nama"
                + " FROM buku inner join kategori on(buku.id_kategori=kategori.id)");
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
            Buku buku=new Buku();
            Kategori kategori=new Kategori();
            
            buku.setId(rs.getLong("id"));
            buku.setJudul(rs.getString("judul"));
            buku.setPenulis(rs.getString("penulis"));
            
            kategori.setId(rs.getLong("id_kategori"));
            kategori.setNama(rs.getString("nama"));
            
            buku.setKategori(kategori);
            
            daftarBuku.add(buku);
        }
        return daftarBuku;
    }
}