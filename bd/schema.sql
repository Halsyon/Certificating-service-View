CREATE table licensings
(
);

create table licenses
(
    license_Id     varchar(255) not null,
    contact_email varchar(255) not null,
    contact_name  varchar(255) not null,
    contact_phone varchar(255) not null,
    name          varchar(255) not null,
    primary key (license_Id)
);
