# --- !Ups

create table "people" (
  "id" serial not null primary key,
  "name" varchar not null,
  "age" int not null
);

# --- !Downs

drop table "people" if exists;
