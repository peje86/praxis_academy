1. masuk ke postgre
   - buka terminal ketik sudo su postgres lalu enter

2. masuk ke database
    - ketik psql      lalu anda dibawa ke sql postgre

3. perintah membuat database
    -  CREATE DATABASE nama_database;   //contoh : CREATE DATABASE;toko_online  lalu tekan enter

4. perintah masuk ke database 
    - psql nama_database   contoh: psql toko_online    lalu enter

5. perintah membuat tabel
    - CREATE TABLE nama_tabel (row1 ,row2,row3); 
      contoh CREATE TABLE users (id_users int not null,nama varchar, alamat varchar);
      lalu enter.

6. perintah mengisi tabel // HARUS BERADA DIDALAM DATABASE
    - INSERT INTO nama_tabel VALUES (isi,isi,isi);  enter
      contoh : INSERT INTO users VALUES (1,'pujiono','jalan maju mundur yogyakarta');  enter

7.perintah menghapus database
    - DROP DATABASE nama_database;
      contoh :  DROP DATABASE toko_online;

8. mengganti nama database
    - ALTER DATABASE db RENAME TO newdb;
      contoh : ALTER DATABASE toko_online RENAME TO tokoku;

9. merubah kolom tabel menjadi  primary key 
    -  ALTER TABLE nama_tabelnya ADD PRIMARY KEY (nama_attribut_yg_ diijadikan_p_key);
        contoh  ALTER TABLE users ADD PRIMARY KEY (id_users); 

10. merelasikan sebuah tabel, dengan perintah constraint  //  SYARAT PRIMARY KEY DIBUAT DULU
    - perintah  ALTER TABLE table ADD FOREIGN KEY (id_atributA) REFERENCES users(id_atributA);  id_atribut harus sama agar bisa direlasikan.

    - CONTOH : toko_online=# ALTER TABLE pembelian ADD FOREIGN KEY (id_users) REFERENCES users(id_users);
11. membuka detail 
    - \d  

12. MERUBAH NAMA kolom 
    - Perintah: ALTER TABLE nama_table RENAME COLUMN nama_colom TO new_nama_colom;

    -contoh : toko_online=# ALTER TABLE pembelian RENAME COLUMN id_barang TO id_properties;

13. menghapus FOREIGN KEY
    -PERINTAH: ALTER TABLE nama_tabel DROP CONSTRAINT (id_foreignkey (lihat pake \d nama_tabel))pembelian_id_users_fkey;

    - toko_online=# ALTER TABLE pembelian DROP CONSTRAINT pembelian_id_users_fkey;

14. menampilkan isi tabel
    - SELECT * FROM nama_tabel;
    - contoh : SELECT * FROM pembelian;

15. menggabungkan 2 tabel yang mempunyai  nilai 0, 
    -  SELECT
        nama_table1.id(A), first_name, last_name,
        email, amount, payment_date
        FROM nama_tabel2
        INNER JOIN
        nama_tabel1 ON nama_tabel1.id(A) = nama_table2.id(A);

    - Contoh : toko_online=# SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users;

16. menampilkan 2 tabel berdasarkan id
   - SELECT
    customer.customer_id, first_name, last_name,
    email, amount, payment_date
    FROM customer
    INNER JOIN payment ON payment.customer_id = customer.customer_id
    ORDER BY customer.customer_id;
    - perintah 

17. menggabungkan 2 tabel berdasarkan kolom
    - perintah SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users ORDER BY users.nama;

