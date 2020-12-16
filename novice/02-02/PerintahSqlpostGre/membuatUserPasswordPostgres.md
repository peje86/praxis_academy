1. membuat user dan password di postgresql
    CREATE USER nama_user WITH PASSWORD 'password***' login ; //login adalah hak akses

    contoh : postgres=# create user peje86 with password 'peje1234' login ;

2. perintah menghapus user

    - DROP USER nama_user ;

3.menampilkan user 
    - perintah : \du

postgres=# \du
                                   List of roles
 Role name |                         Attributes                         | Member of 
-----------+------------------------------------------------------------+-----------
 peje86    |                                                            | {}
 postgres  | Superuser, Create role, Create DB, Replication, Bypass RLS | {}

postgres=# 

