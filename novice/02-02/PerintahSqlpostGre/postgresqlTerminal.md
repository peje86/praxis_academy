postgres@pujiono:/home/pujiono$ psql
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

postgres=# /l
postgres-# \l
                                   List of databases
    Name     |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
-------------+----------+----------+-------------+-------------+-----------------------
 postgres    | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0   | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
             |          |          |             |             | postgres=CTc/postgres
 template1   | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
             |          |          |             |             | postgres=CTc/postgres
 toko_online | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
(4 rows)

postgres-# psql toko_online
postgres-# psql toko_online
postgres-# \q
postgres@pujiono:/home/pujiono$ psql toko_online
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

toko_online=# ALTER TABLE properties ALTER COLUMN id_properties int not null (11) FOREIGN KEY;
ERROR:  syntax error at or near "int"
LINE 1: ALTER TABLE properties ALTER COLUMN id_properties int not nu...
                                                          ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties  not null (11) FOREIGN KEY;
ERROR:  syntax error at or near "not"
LINE 1: ...LTER TABLE properties ALTER COLUMN id_properties  not null (...
                                                             ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties TYPE int  not null (11) FOREIGN KEY;
ERROR:  syntax error at or near "not"
LINE 1: ...E properties ALTER COLUMN id_properties TYPE int  not null (...
                                                             ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties TYPE int (11)  not null  FOREIGN KEY;
ERROR:  syntax error at or near "("
LINE 1: ...LE properties ALTER COLUMN id_properties TYPE int (11)  not ...
                                                             ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties TYPE int [11]  not null  FOREIGN KEY;
ERROR:  syntax error at or near "not"
LINE 1: ...perties ALTER COLUMN id_properties TYPE int [11]  not null  ...
                                                             ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties TYPE int [11]   FOREIGN KEY;
ERROR:  syntax error at or near "FOREIGN"
LINE 1: ...erties ALTER COLUMN id_properties TYPE int [11]   FOREIGN KE...
                                                             ^
toko_online=# ALTER TABLE properties ALTER COLUMN id_properties FOREIGN KEY;
ERROR:  syntax error at or near "FOREIGN"
LINE 1: ALTER TABLE properties ALTER COLUMN id_properties FOREIGN KE...
                                                          ^
toko_online=#  ALTER TABLE propert^ZDD PRIMARY KEY (nama_attribut_yg_ diijadikan_p_key);
[1]+  Stopped                 psql toko_online
postgres@pujiono:/home/pujiono$ psql toko_online
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

toko_online=#  ALTER TABLE properties ADD PRIMARY KEY (id_properties);
ALTER TABLE
toko_online=#  ALTER TABLE users ADD PRIMARY KEY (id_users);
ALTER TABLE
toko_online=#  ALTER TABLE pembelian ADD PRIMARY KEY (id_pembelian);
ALTER TABLE
toko_online=# ALTER TABLE pembelian ADD FOREIGN KEY (id_users) REFERENCES users(id_users);
ALTER TABLE
toko_online=# \dt users
         List of relations
 Schema | Name  | Type  |  Owner   
--------+-------+-------+----------
 public | users | table | postgres
(1 row)

toko_online=# \d users
                     Table "public.users"
  Column  |       Type        | Collation | Nullable | Default 
----------+-------------------+-----------+----------+---------
 id_users | integer           |           | not null | 
 nama     | character varying |           |          | 
 alamat   | character varying |           |          | 
Indexes:
    "users_pkey" PRIMARY KEY, btree (id_users)
Referenced by:
    TABLE "pembelian" CONSTRAINT "pembelian_id_users_fkey" FOREIGN KEY (id_users) REFERENCES users(id_users)

toko_online=# \d pembelian
                Table "public.pembelian"
    Column    |  Type   | Collation | Nullable | Default 
--------------+---------+-----------+----------+---------
 id_pembelian | integer |           | not null | 
 id_users     | integer |           | not null | 
 id_barang    | integer |           |          | 
Indexes:
    "pembelian_pkey" PRIMARY KEY, btree (id_pembelian)
Foreign-key constraints:
    "pembelian_id_users_fkey" FOREIGN KEY (id_users) REFERENCES users(id_users)

toko_online=# \d properties
                     Table "public.properties"
    Column     |       Type        | Collation | Nullable | Default 
---------------+-------------------+-----------+----------+---------
 id_properties | integer           |           | not null | 
 barang        | character varying |           |          | 
 harga         | double precision  |           |          | 
Indexes:
    "properties_pkey" PRIMARY KEY, btree (id_properties)

toko_online=# ALTER TABLE pembelian ALTER COLUMN id_barang SET id_properties;
ERROR:  syntax error at or near "id_properties"
LINE 1: ALTER TABLE pembelian ALTER COLUMN id_barang SET id_properti...
                                                         ^
toko_online=# ALTER TABLE pembelian RENAME COLUMN id_barang TO id_properties;
ALTER TABLE
toko_online=# \d properties
                     Table "public.properties"
    Column     |       Type        | Collation | Nullable | Default 
---------------+-------------------+-----------+----------+---------
 id_properties | integer           |           | not null | 
 barang        | character varying |           |          | 
 harga         | double precision  |           |          | 
Indexes:
    "properties_pkey" PRIMARY KEY, btree (id_properties)

toko_online=#  ALTER TABLE pembelian ADD FOREIGN KEY (id_properties) REFERENCES properties(id_properties);
ALTER TABLE
toko_online=# \d pembalian
Did not find any relation named "pembalian".
toko_online=# \d pembelian
                 Table "public.pembelian"
    Column     |  Type   | Collation | Nullable | Default 
---------------+---------+-----------+----------+---------
 id_pembelian  | integer |           | not null | 
 id_users      | integer |           | not null | 
 id_properties | integer |           |          | 
Indexes:
    "pembelian_pkey" PRIMARY KEY, btree (id_pembelian)
Foreign-key constraints:
    "pembelian_id_properties_fkey" FOREIGN KEY (id_properties) REFERENCES properties(id_properties)
    "pembelian_id_users_fkey" FOREIGN KEY (id_users) REFERENCES users(id_users)

toko_online=# ALTER TABLE child_table
toko_online-# DROP CONSTRAINT constraint_fkey;
ERROR:  relation "child_table" does not exist
toko_online=# ALTER TABLE child_table
DROP CONSTRAINT constraint_fkey;
ERROR:  relation "child_table" does not exist
toko_online=# ALTER TABLE pembelian DROP CONSTRAINT pembelian_id_users_fkey;
ALTER TABLE
toko_online=# \d pembelian
                 Table "public.pembelian"
    Column     |  Type   | Collation | Nullable | Default 
---------------+---------+-----------+----------+---------
 id_pembelian  | integer |           | not null | 
 id_users      | integer |           | not null | 
 id_properties | integer |           |          | 
Indexes:
    "pembelian_pkey" PRIMARY KEY, btree (id_pembelian)
Foreign-key constraints:
    "pembelian_id_properties_fkey" FOREIGN KEY (id_properties) REFERENCES properties(id_properties)

toko_online=# ALTER TABLE pembelian ADD FOREIGN KEY (id_users) REFERENCES users(id_users); 
ALTER TABLE
toko_online=# \d
           List of relations
 Schema |    Name    | Type  |  Owner   
--------+------------+-------+----------
 public | pembelian  | table | postgres
 public | properties | table | postgres
 public | users      | table | postgres
(3 rows)

toko_online=# \d pembelian
                 Table "public.pembelian"
    Column     |  Type   | Collation | Nullable | Default 
---------------+---------+-----------+----------+---------
 id_pembelian  | integer |           | not null | 
 id_users      | integer |           | not null | 
 id_properties | integer |           |          | 
Indexes:
    "pembelian_pkey" PRIMARY KEY, btree (id_pembelian)
Foreign-key constraints:
    "pembelian_id_properties_fkey" FOREIGN KEY (id_properties) REFERENCES properties(id_properties)
    "pembelian_id_users_fkey" FOREIGN KEY (id_users) REFERENCES users(id_users)

toko_online=# SELECT * FROM pembelian;
 id_pembelian | id_users | id_properties 
--------------+----------+---------------
            1 |        1 |             1
            2 |        1 |             3
            3 |        2 |             2
(3 rows)

toko_online=#  SELECT
toko_online-# customer.customer_id, first_name, last_name,
toko_online-# email, amount, payment_date
toko_online-# FROM customer
toko_online-# INNER JOIN
toko_online-# payment ON payment.customer_id = customer.customer_id;
ERROR:  relation "customer" does not exist
LINE 4: FROM customer
             ^
toko_online=# SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users;
 id_users |  nama   |                   alamat                    
----------+---------+---------------------------------------------
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
        2 | evan    | surabaya
(3 rows)

toko_online=# SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users ORDER BY users.id_users;
 id_users |  nama   |                   alamat                    
----------+---------+---------------------------------------------
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
        2 | evan    | surabaya
(3 rows)

toko_online=# SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users ORDER BY users.nama;
 id_users |  nama   |                   alamat                    
----------+---------+---------------------------------------------
        2 | evan    | surabaya
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
        1 | pujiono | tegal balong rt 01 rw 17 bimomartani sleman
(3 rows)

toko_online=# DELETE FROM users WHERE id_users=2;
ERROR:  update or delete on table "users" violates foreign key constraint "pembelian_id_users_fkey" on table "pembelian"
DETAIL:  Key (id_users)=(2) is still referenced from table "pembelian".
toko_online=# ALTER TABLE pembelian RENAME COLUMN id_barang TO id_properties;





