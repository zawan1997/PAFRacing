create table pilot_details (
pilot_id char(8) not null,
pilot_name varchar(128),
drone_name varchar(128),
primary key(pilot_id)
);

create table race_details (
race_id char(8) not null,
race_name varchar(128),
no_lap int,
race_date date not null,
primary key(race_id)
);

create table lap_details (
lap_id int auto_increment not null,
lap_time int, 
pilot_id char(8) not null,
race_id char(8) not null,
primary key(lap_id),
constraint fk_pilot_id
	foreign key(pilot_id) references pilot_details(pilot_id),
constraint fk_race_id
	foreign key(race_id) references race_details(race_id)
);