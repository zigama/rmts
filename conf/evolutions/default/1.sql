# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cell (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  country_id                bigint,
  province_id               bigint,
  district_id               bigint,
  sector_id                 bigint,
  constraint uq_cell_name unique (name),
  constraint uq_cell_code unique (code),
  constraint pk_cell primary key (id))
;

create table country (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  nationality               varchar(255),
  constraint uq_country_name unique (name),
  constraint uq_country_code unique (code),
  constraint pk_country primary key (id))
;

create table district (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  country_id                bigint,
  province_id               bigint,
  constraint uq_district_name unique (name),
  constraint uq_district_code unique (code),
  constraint pk_district primary key (id))
;

create table facility (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  type                      varchar(12),
  country_id                bigint,
  province_id               bigint,
  district_id               bigint,
  referral                  bigint,
  constraint ck_facility_type check (type in ('Hospital','HealthCenter')),
  constraint uq_facility_name unique (name),
  constraint uq_facility_code unique (code),
  constraint pk_facility primary key (id))
;

create table location (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  type                      varchar(12),
  latitude                  double,
  longitude                 double,
  constraint ck_location_type check (type in ('Country','Province','District','Sector','Cell','Village','Hospital','HealthCenter')),
  constraint uq_location_name unique (name),
  constraint uq_location_code unique (code),
  constraint pk_location primary key (id))
;

create table malaria_case (
  id                        bigint not null,
  case_no                   varchar(255),
  case_sys_ref_no           varchar(255),
  district_id               bigint,
  hospital_id               bigint,
  facility_id               bigint,
  date                      timestamp,
  in_patient                varchar(10),
  referred                  integer,
  referred_to_id            bigint,
  patient_id                bigint,
  is_pregnant               varchar(3),
  head_of_household         varchar(255),
  occupation                varchar(255),
  blood_transfusion         integer,
  transfusion_date          timestamp,
  often_work_away           integer,
  date_onset_illness        timestamp,
  slept_home_before         integer,
  slept_work_before         integer,
  within14days              integer,
  outside14days             integer,
  date_back_home            timestamp,
  prevention_before_travel  integer,
  next42days                integer,
  vivax_species             boolean,
  falciparum_species        boolean,
  malariae_species          boolean,
  ovale_species             boolean,
  completed_date            timestamp,
  verified_date             timestamp,
  constraint ck_malaria_case_in_patient check (in_patient in ('InPatient','OutPatient')),
  constraint ck_malaria_case_referred check (referred in (0,1)),
  constraint ck_malaria_case_is_pregnant check (is_pregnant in ('YES','NO')),
  constraint ck_malaria_case_blood_transfusion check (blood_transfusion in (0,1)),
  constraint ck_malaria_case_often_work_away check (often_work_away in (0,1,2,3)),
  constraint ck_malaria_case_slept_home_before check (slept_home_before in (0,1,2,3,4)),
  constraint ck_malaria_case_slept_work_before check (slept_work_before in (0,1,2,3,4)),
  constraint ck_malaria_case_within14days check (within14days in (0,1)),
  constraint ck_malaria_case_outside14days check (outside14days in (0,1)),
  constraint ck_malaria_case_prevention_before_travel check (prevention_before_travel in (0,1,2)),
  constraint ck_malaria_case_next42days check (next42days in (0,1)),
  constraint pk_malaria_case primary key (id))
;

create table patient (
  id                        bigint not null,
  first_name                varchar(255),
  surname                   varchar(255),
  national_id               varchar(255),
  telephone                 varchar(255),
  dob                       timestamp,
  gender                    varchar(6),
  constraint ck_patient_gender check (gender in ('MALE','FEMALE')),
  constraint uq_patient_national_id unique (national_id),
  constraint pk_patient primary key (id))
;

create table province (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  country_id                bigint,
  constraint uq_province_name unique (name),
  constraint uq_province_code unique (code),
  constraint pk_province primary key (id))
;

create table sector (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  country_id                bigint,
  province_id               bigint,
  district_id               bigint,
  constraint uq_sector_name unique (name),
  constraint uq_sector_code unique (code),
  constraint pk_sector primary key (id))
;

create table user (
  id                        bigint not null,
  email                     varchar(255),
  password                  varchar(255),
  telephone                 varchar(255),
  fullname                  varchar(255),
  dob                       timestamp,
  gender                    varchar(6),
  user_group_id             bigint,
  constraint ck_user_gender check (gender in ('MALE','FEMALE')),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create table user_group (
  id                        bigint not null,
  title                     varchar(255),
  short_title               varchar(255),
  supergroup                bigint,
  created_at                timestamp,
  updated_at                timestamp,
  created_by                bigint,
  update_by                 bigint,
  constraint uq_user_group_title unique (title),
  constraint uq_user_group_short_title unique (short_title),
  constraint pk_user_group primary key (id))
;

create table village (
  id                        bigint not null,
  name                      varchar(255),
  code                      varchar(255),
  country_id                bigint,
  province_id               bigint,
  district_id               bigint,
  sector_id                 bigint,
  cell_id                   bigint,
  constraint uq_village_name unique (name),
  constraint uq_village_code unique (code),
  constraint pk_village primary key (id))
;

create sequence cell_seq;

create sequence country_seq;

create sequence district_seq;

create sequence facility_seq;

create sequence location_seq;

create sequence malaria_case_seq;

create sequence patient_seq;

create sequence province_seq;

create sequence sector_seq;

create sequence user_seq;

create sequence user_group_seq;

create sequence village_seq;

alter table cell add constraint fk_cell_country_1 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_cell_country_1 on cell (country_id);
alter table cell add constraint fk_cell_province_2 foreign key (province_id) references province (id) on delete restrict on update restrict;
create index ix_cell_province_2 on cell (province_id);
alter table cell add constraint fk_cell_district_3 foreign key (district_id) references district (id) on delete restrict on update restrict;
create index ix_cell_district_3 on cell (district_id);
alter table cell add constraint fk_cell_sector_4 foreign key (sector_id) references sector (id) on delete restrict on update restrict;
create index ix_cell_sector_4 on cell (sector_id);
alter table district add constraint fk_district_country_5 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_district_country_5 on district (country_id);
alter table district add constraint fk_district_province_6 foreign key (province_id) references province (id) on delete restrict on update restrict;
create index ix_district_province_6 on district (province_id);
alter table facility add constraint fk_facility_country_7 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_facility_country_7 on facility (country_id);
alter table facility add constraint fk_facility_province_8 foreign key (province_id) references province (id) on delete restrict on update restrict;
create index ix_facility_province_8 on facility (province_id);
alter table facility add constraint fk_facility_district_9 foreign key (district_id) references district (id) on delete restrict on update restrict;
create index ix_facility_district_9 on facility (district_id);
alter table facility add constraint fk_facility_referral_10 foreign key (referral) references facility (id) on delete restrict on update restrict;
create index ix_facility_referral_10 on facility (referral);
alter table malaria_case add constraint fk_malaria_case_district_11 foreign key (district_id) references district (id) on delete restrict on update restrict;
create index ix_malaria_case_district_11 on malaria_case (district_id);
alter table malaria_case add constraint fk_malaria_case_hospital_12 foreign key (hospital_id) references facility (id) on delete restrict on update restrict;
create index ix_malaria_case_hospital_12 on malaria_case (hospital_id);
alter table malaria_case add constraint fk_malaria_case_facility_13 foreign key (facility_id) references facility (id) on delete restrict on update restrict;
create index ix_malaria_case_facility_13 on malaria_case (facility_id);
alter table malaria_case add constraint fk_malaria_case_referredTo_14 foreign key (referred_to_id) references facility (id) on delete restrict on update restrict;
create index ix_malaria_case_referredTo_14 on malaria_case (referred_to_id);
alter table malaria_case add constraint fk_malaria_case_patient_15 foreign key (patient_id) references patient (id) on delete restrict on update restrict;
create index ix_malaria_case_patient_15 on malaria_case (patient_id);
alter table province add constraint fk_province_country_16 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_province_country_16 on province (country_id);
alter table sector add constraint fk_sector_country_17 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_sector_country_17 on sector (country_id);
alter table sector add constraint fk_sector_province_18 foreign key (province_id) references province (id) on delete restrict on update restrict;
create index ix_sector_province_18 on sector (province_id);
alter table sector add constraint fk_sector_district_19 foreign key (district_id) references district (id) on delete restrict on update restrict;
create index ix_sector_district_19 on sector (district_id);
alter table user add constraint fk_user_userGroup_20 foreign key (user_group_id) references user_group (id) on delete restrict on update restrict;
create index ix_user_userGroup_20 on user (user_group_id);
alter table user_group add constraint fk_user_group_superGroup_21 foreign key (supergroup) references user_group (id) on delete restrict on update restrict;
create index ix_user_group_superGroup_21 on user_group (supergroup);
alter table user_group add constraint fk_user_group_createdBy_22 foreign key (created_by) references user (id) on delete restrict on update restrict;
create index ix_user_group_createdBy_22 on user_group (created_by);
alter table user_group add constraint fk_user_group_updatedBy_23 foreign key (update_by) references user (id) on delete restrict on update restrict;
create index ix_user_group_updatedBy_23 on user_group (update_by);
alter table village add constraint fk_village_country_24 foreign key (country_id) references country (id) on delete restrict on update restrict;
create index ix_village_country_24 on village (country_id);
alter table village add constraint fk_village_province_25 foreign key (province_id) references province (id) on delete restrict on update restrict;
create index ix_village_province_25 on village (province_id);
alter table village add constraint fk_village_district_26 foreign key (district_id) references district (id) on delete restrict on update restrict;
create index ix_village_district_26 on village (district_id);
alter table village add constraint fk_village_sector_27 foreign key (sector_id) references sector (id) on delete restrict on update restrict;
create index ix_village_sector_27 on village (sector_id);
alter table village add constraint fk_village_cell_28 foreign key (cell_id) references cell (id) on delete restrict on update restrict;
create index ix_village_cell_28 on village (cell_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cell;

drop table if exists country;

drop table if exists district;

drop table if exists facility;

drop table if exists location;

drop table if exists malaria_case;

drop table if exists patient;

drop table if exists province;

drop table if exists sector;

drop table if exists user;

drop table if exists user_group;

drop table if exists village;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists cell_seq;

drop sequence if exists country_seq;

drop sequence if exists district_seq;

drop sequence if exists facility_seq;

drop sequence if exists location_seq;

drop sequence if exists malaria_case_seq;

drop sequence if exists patient_seq;

drop sequence if exists province_seq;

drop sequence if exists sector_seq;

drop sequence if exists user_seq;

drop sequence if exists user_group_seq;

drop sequence if exists village_seq;

