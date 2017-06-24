drop table designmasters;
create table designmasters(  
  designcode     number(3) primary key,
  designname      varchar2(50));

drop table depmasters;
create table depmasters(  
  depcode	number(2) primary key,
  depname	varchar2(50));

drop table studmasters;
create table studmasters(  
  studcode	number(3) primary key,
  studname	varchar2(50) NOT NULL,  
  depcode	number(2),
  studdob	date,
  studadd	varchar2(240),
  constraint fk_depcode foreign key (depcode) references depmasters (depcode) 
);

drop table studmarks;
create table studmarks(  
	studcode	number(6),
	studyear	number NOT NULL,
	sub1	number(3),
	sub2	number(3),
	sub3	number(3),
	constraint fk_studcode foreign key (studcode) references studmasters (studcode));

drop table staffmasters;
create table staffmasters(  
  staffcode	number(3) primary key,
  staffname	varchar2(50) NOT NULL,  
  designcode	number(2),
  depcode	number,
  hiredate	date,
  staffdob	date,
  staffadd	varchar2(240),
  mgrcode	number(8),
  staffsal	number(10,2),
  constraint fk_designcode foreign key (designcode) references designmasters (designcode),
  constraint fk_dcode foreign key (depcode) references depmasters (depcode));

drop table bookmasters;
create table bookmasters(  
	bookcode	number(10) primary key,
	bookname	varchar2(50) NOT NULL,
	bookpy		number,
	bookpa		varchar(50) NOT NULL 
	);
	

drop table booktrans;
create table booktrans(  
	bookcode	number ,
	studcode	number ,
	staffcode	number ,
	bookissuedate	date NOT NULL,
	bookexpctdrdate	date NOT NULL,
	bookactrdate	date,
	constraint fk_bookcode foreign key (bookcode) references bookmasters (bookcode),
	constraint fk_stucode foreign key (studcode) references studmasters (studcode),	
	constraint fk_staffcode foreign key (staffcode) references staffmasters (staffcode));








