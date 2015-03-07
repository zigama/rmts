# --- Sample dataset

# --- !Ups

insert into user_group (id, title, short_title) values (  1,'Super Administrator', 'superadmin');
insert into user_group (id, title, short_title) values (  2,'System Tester', 'tester');

# --- !Downs

delete from user_group;
