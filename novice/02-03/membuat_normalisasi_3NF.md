pujiono@pujiono:~
$ sudo su postgres
[sudo] password for pujiono: 
postgres@pujiono:/home/pujiono$ psql
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

postgres=# CREATEDB rental_dvd
postgres-# /l
postgres-# psql rental_dvd
postgres-# \q
postgres@pujiono:/home/pujiono$ psql
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

postgres=# createdb rental_dvd
postgres-# createdb rental_dvd;
ERROR:  syntax error at or near "createdb"
LINE 1: createdb rental_dvd
        ^
postgres=# CREATEDB rental_dvd
postgres-# createdb rental_dvd;
ERROR:  syntax error at or near "CREATEDB"
LINE 1: CREATEDB rental_dvd
        ^
postgres=# CREATE DATABASE rental_dvd
postgres-# CREATE DATABASE rental_dvd;
ERROR:  syntax error at or near "CREATE"
LINE 2: CREATE DATABASE rental_dvd;
        ^
postgres=# psql
postgres-# clc
postgres-# exit
Use \q to quit.
postgres-# exit;
Use \q to quit.
ERROR:  syntax error at or near "psql"
LINE 1: psql
        ^
postgres=# \q
postgres@pujiono:/home/pujiono$ exit
pujiono@pujiono:~
$ sudo su postgres
[sudo] password for pujiono: 
postgres@pujiono:/home/pujiono$ psql
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

postgres=# \l
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

postgres=# create database rental_dvd;
CREATE DATABASE
postgres=# psql rental_dvd
postgres-# ;
ERROR:  syntax error at or near "psql"
LINE 1: psql rental_dvd
        ^
postgres=# psql rental_dvd;
ERROR:  syntax error at or near "psql"
LINE 1: psql rental_dvd;
        ^
postgres=# \l
                                   List of databases
    Name     |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
-------------+----------+----------+-------------+-------------+-----------------------
 postgres    | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 rental_dvd  | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0   | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
             |          |          |             |             | postgres=CTc/postgres
 template1   | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
             |          |          |             |             | postgres=CTc/postgres
 toko_online | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
(5 rows)

postgres=# psql rental_dvd;
ERROR:  syntax error at or near "psql"
LINE 1: psql rental_dvd;
        ^
postgres=# psql rental_dvd
postgres-# \q
postgres@pujiono:/home/pujiono$ exit
pujiono@pujiono:~
$ sudo su postgres
postgres@pujiono:/home/pujiono$ psql rental_dvd
psql (11.9 (Debian 11.9-0+deb10u1))
Type "help" for help.

rental_dvd=# CREATE TABLE memberships (memberships_id int not null,full_name varchar not null,addres varchar not null, salutation_id int not null);
CREATE TABLE
rental_dvd=# CREATE TABLE movies_rented (memberships_id int not null,movie varchar not null);
CREATE TABLE
rental_dvd=# select * from memberships;
 memberships_id | full_name | addres | salutation_id 
----------------+-----------+--------+---------------
(0 rows)

rental_dvd=# CREATE TABLE salutations(salutation_id int not null salutation varchar not null);
ERROR:  syntax error at or near "salutation"
LINE 1: ...EATE TABLE salutations(salutation_id int not null salutation...
                                                             ^
rental_dvd=# CREATE TABLE salutations(salutation_id int not null, salutation varchar not null);
CREATE TABLE
rental_dvd=# INSERT INTO memberships (1,JanetJones,FirstStreet Plot No.4,2),(2,RobertPhill,3rd Strett 34,1),(3,RobertPhill,5th Avenue,1);
ERROR:  syntax error at or near "1"
LINE 1: INSERT INTO memberships (1,JanetJones,FirstStreet Plot No.4,...
rental_dvd=# INSERT INTO memberships (1,'JanetJones','FirstStreet Plot No.4',2),(2,'RobertPhill','3rd Strett 34',1),(3,'RobertPhill','5th Avenue',1);
ERROR:  syntax error at or near "1";
LINE 1: INSERT INTO memberships (1,'JanetJones','FirstStreet Plot No...
                                 ^
rental_dvd=# INSERT INTO memberships (1,'JanetJones','FirstStreet Plot No.4',2);
ERROR:  syntax error at or near "1"
LINE 1: INSERT INTO memberships (1,'JanetJones','FirstStreet Plot No...
                                 ^
rental_dvd=# \d memberships
                     Table "public.memberships"
     Column     |       Type        | Collation | Nullable | Default 
----------------+-------------------+-----------+----------+---------
 memberships_id | integer           |           | not null | 
 full_name      | character varying |           | not null | 
 addres         | character varying |           | not null | 
 salutation_id  | integer           |           | not null | 

rental_dvd=# INSERT INTO memberships VALUES (1,'JanetJones','FirstStreet Plot No.4',2),(2,'RobertPhill','3rd Strett 34',1),(3,'RobertPhill','5th Avenue',1);
INSERT 0 3
rental_dvd=# \d memberships
                     Table "public.memberships"
     Column     |       Type        | Collation | Nullable | Default 
----------------+-------------------+-----------+----------+---------
 memberships_id | integer           |           | not null | 
 full_name      | character varying |           | not null | 
 addres         | character varying |           | not null | 
 salutation_id  | integer           |           | not null | 

rental_dvd=# select*from memberships;
 memberships_id |  full_name  |        addres         | salutation_id 
----------------+-------------+-----------------------+---------------
              1 | JanetJones  | FirstStreet Plot No.4 |             2
              2 | RobertPhill | 3rd Strett 34         |             1
              3 | RobertPhill | 5th Avenue            |             1
(3 rows)

rental_dvd=# INSERT INTO movies_rented VALUES (1,'Pirates of the Carribean'),(1,'Clash of the Titans'),(2,'Forgetting Sarah Marshal'),(2,'Daddy`s Little Girls'),(3,'Class of the Titans');
INSERT 0 5
rental_dvd=# INSERT INTO salutations VALUES (1,'Mr.'),(2,'Ms.'),(3,'Mrs.'),(4,'Dr.');
INSERT 0 4
rental_dvd=# /d movies_rented;
ERROR:  syntax error at or near "/"
LINE 1: /d movies_rented;
        ^
rental_dvd=# \d movies_rented;
                    Table "public.movies_rented"
     Column     |       Type        | Collation | Nullable | Default 
----------------+-------------------+-----------+----------+---------
 memberships_id | integer           |           | not null | 
 movie          | character varying |           | not null | 

rental_dvd=# select * from movies_rented;
 memberships_id |          movie           
----------------+--------------------------
              1 | Pirates of the Carribean
              1 | Clash of the Titans
              2 | Forgetting Sarah Marshal
              2 | Daddy`s Little Girls
              3 | Class of the Titans
(5 rows)

rental_dvd=# select * from memberships;
 memberships_id |  full_name  |        addres         | salutation_id 
----------------+-------------+-----------------------+---------------
              1 | JanetJones  | FirstStreet Plot No.4 |             2
              2 | RobertPhill | 3rd Strett 34         |             1
              3 | RobertPhill | 5th Avenue            |             1
(3 rows)

rental_dvd=# select * from salutations;
 salutation_id | salutation 
---------------+------------
             1 | Mr.
             2 | Ms.
             3 | Mrs.
             4 | Dr.
(4 rows)

rental_dvd=#  ALTER TABLE memberships ADD PRIMARY KEY (memberships_id); 
ALTER TABLE
rental_dvd=#  ALTER TABLE salutations ADD PRIMARY KEY (salutation_id); 
ALTER TABLE
rental_dvd=#  ALTER TABLE movies_rented ADD FOREIGN KEY (memberships_id) REFERENCES memberships(memberships_id);
ALTER TABLE
rental_dvd=#  ALTER TABLE memberships ADD FOREIGN KEY (salutation_id) REFERENCES salutations(salutation_id);
ALTER TABLE
rental_dvd=# \d memberships
                     Table "public.memberships"
     Column     |       Type        | Collation | Nullable | Default 
----------------+-------------------+-----------+----------+---------
 memberships_id | integer           |           | not null | 
 full_name      | character varying |           | not null | 
 addres         | character varying |           | not null | 
 salutation_id  | integer           |           | not null | 
Indexes:
    "memberships_pkey" PRIMARY KEY, btree (memberships_id)
Foreign-key constraints:
    "memberships_salutation_id_fkey" FOREIGN KEY (salutation_id) REFERENCES salutations(salutation_id)
Referenced by:
    TABLE "movies_rented" CONSTRAINT "movies_rented_memberships_id_fkey" FOREIGN KEY (memberships_id) REFERENCES memberships(memberships_id)

rental_dvd=# \d movies_rented
                    Table "public.movies_rented"
     Column     |       Type        | Collation | Nullable | Default 
----------------+-------------------+-----------+----------+---------
 memberships_id | integer           |           | not null | 
 movie          | character varying |           | not null | 
Foreign-key constraints:
    "movies_rented_memberships_id_fkey" FOREIGN KEY (memberships_id) REFERENCES memberships(memberships_id)

rental_dvd=# SELECT SELECT users.id_users,nama,alamat FROM users INNER JOIN pembelian ON pembelian.id_users=users.id_users;
ERROR:  syntax error at or near "SELECT"
LINE 1: SELECT SELECT users.id_users,nama,alamat FROM users INNER JO...
rental_dvd=# SELECT memberships.memberships_id,nama,full_name FROM memberships RIGHT JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id where memberships.memberships_id='1' ;
ERROR:  column "nama" does not exist
LINE 1: SELECT memberships.memberships_id,nama,full_name FROM member...
                                          ^
rental_dvd=# SELECT memberships.memberships_id,full_name FROM memberships RIGHT JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id where memberships.memberships_id='1' ;
 memberships_id | full_name  
----------------+------------
              1 | JanetJones
              1 | JanetJones
(2 rows)

rental_dvd=# SELECT memberships.memberships_id,full_name FROM memberships LEFT JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id where memberships.memberships_id='1' ;
 memberships_id | full_name  
----------------+------------
              1 | JanetJones
              1 | JanetJones
(2 rows)

rental_dvd=# SELECT memberships.memberships_id,full_name FROM memberships LEFT JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id ORDER BY movie  where  memberships.memberships_id='1' ;
ERROR:  syntax error at or near "where"
LINE 1: ...ips_id=memberships.memberships_id ORDER BY movie  where  mem...
                                                             ^
rental_dvd=# SELECT memberships.memberships_id,full_name FROM memberships LEFT JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id ORDER BY movie  ;
 memberships_id |  full_name  
----------------+-------------
              1 | JanetJones
              3 | RobertPhill
              2 | RobertPhill
              2 | RobertPhill
              1 | JanetJones
(5 rows)

rental_dvd=# SELECT memberships.memberships_id,full_name FROM memberships INNER JOIN movies_rented ON movies_rented.memberships_id=memberships.memberships_id ORDER BY movie  ;
 memberships_id |  full_name  
----------------+-------------
              1 | JanetJones
              3 | RobertPhill
              2 | RobertPhill
              2 | RobertPhill
              1 | JanetJones
(5 rows)

rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships ON memberships.memberships_id=movies_rented.memberships_id ORDER BY movie  ;
 memberships_id |          movie           
----------------+--------------------------
              1 | Clash of the Titans
              3 | Class of the Titans
              2 | Daddy`s Little Girls
              2 | Forgetting Sarah Marshal
              1 | Pirates of the Carribean
(5 rows)

rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships ON memberships.memberships_id=movies_rented.memberships_id ORDER BY movie WHERE memberships_id=1 ;
ERROR:  syntax error at or near "WHERE"
LINE 1: ...ps_id=movies_rented.memberships_id ORDER BY movie WHERE memb...
                                                             ^
rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships ON memberships.memberships_id=movies_rented.memberships_id WHERE memberships_id=1 ;
ERROR:  column reference "memberships_id" is ambiguous
LINE 1: ...memberships_id=movies_rented.memberships_id WHERE membership...
                                                             ^
rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships ON memberships.memberships_id=movies_rented.memberships_id WHERE,memberships. memberships_id=1 ;
ERROR:  syntax error at or near ","
LINE 1: ....memberships_id=movies_rented.memberships_id WHERE,membershi...
                                                             ^
rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships ON memberships.memberships_id=movies_rented.memberships_id WHERE memberships. memberships_id=1 ;
 memberships_id |          movie           
----------------+--------------------------
              1 | Pirates of the Carribean
              1 | Clash of the Titans
(2 rows)

rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships.memberships_id,full_name ON memberships.memberships_id=movies_rented.memberships_id WHERE memberships. memberships_id=1 ;
ERROR:  syntax error at or near ","
LINE 1: ...ovies_rented RIGHT JOIN memberships.memberships_id,full_name...
                                                             ^
rental_dvd=# SELECT movies_rented.memberships_id,movie FROM movies_rented RIGHT JOIN memberships.full_name ON memberships.memberships_id=movies_rented.memberships_id WHERE memberships. memberships_id=1 ;
ERROR:  relation "memberships.full_name" does not exist
LINE 1: ...emberships_id,movie FROM movies_rented RIGHT JOIN membership...
                                                             ^
rental_dvd=# SELECT *  FROM movies_rented RIGHT JOIN memberships  ON memberships.memberships_id=movies_rented.memberships_id WHERE memberships. memberships_id=1 ;
 memberships_id |          movie           | memberships_id | full_name  |        addres         | salutation_id 
----------------+--------------------------+----------------+------------+-----------------------+---------------
              1 | Pirates of the Carribean |              1 | JanetJones | FirstStreet Plot No.4 |             2
              1 | Clash of the Titans      |              1 | JanetJones | FirstStreet Plot No.4 |             2
(2 rows)

rental_dvd=# 
