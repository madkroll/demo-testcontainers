CREATE USER DEMO_USER IDENTIFIED BY dummypassword;

GRANT create session TO DEMO_USER;
GRANT create table TO DEMO_USER;
GRANT create view TO DEMO_USER;
GRANT create any trigger TO DEMO_USER;
GRANT create any procedure TO DEMO_USER;
GRANT create sequence TO DEMO_USER;
GRANT create synonym TO DEMO_USER;

ALTER USER SYS quota unlimited on USERS;
ALTER USER DEMO_USER quota unlimited on USERS;