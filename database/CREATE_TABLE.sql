/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     25/04/2023 08:47:36                          */
/*==============================================================*/

use google_scholar;

drop table if exists AUTHOR;

/*==============================================================*/
/* Table: AUTHOR                                                */
/*==============================================================*/
create table AUTHOR
(
   AUTHOR_ID            varchar(36) not null,
   NAME                 varchar(256),
   AFFILIATIONS         varchar(256),
   EMAIL                varchar(256),
   THUMBNAIL            varchar(256),
   GOOGLE_SCHOLAR_ID    varchar(16) not null UNIQUE,
   primary key (AUTHOR_ID)
);
