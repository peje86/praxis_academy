
package com.JoinTabel.JoinTabel.controller;
 
import com.JoinTabel.JoinTabel.repositories.DAO.BukuDaoJdbc;
import com.JoinTabel.JoinTabel.model.Buku;
// import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.List;
 
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        //setingan datasource
        MysqlDataSource dataSource=new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("daojointabel");
        dataSource.setUser("root");
        dataSource.setPassword("");
        
        BukuDaoJdbc bukuDao=new BukuDaoJdbc(dataSource.getConnection());
        
        //ambil data dari basisdata
        List<Buku> daftarBuku=bukuDao.getAll();
        
        //cetak hasil kelayar
        for(Buku b:daftarBuku){
            System.out.println("Judul : "+b.getJudul()+" Penulis : "+b.getPenulis()+" Kategori : "+b.getKategori().getNama());
        }
    }
}