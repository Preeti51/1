use cap1;

insert into magazine_store(mag_id,edition,stock) values(101,1,21);
insert into magazine_store(mag_id,edition,stock) values(102,1,39);
insert into magazine_store(mag_id,edition,stock) values(103,2,214);

select * from magazine_store;

insert into mag_subscription(user_id,mag_id,start_date,end_date) values(701,101,'2021-7-20','2011-8-21');
insert into mag_subscription(user_id,mag_id,start_date,end_date) values(702,103,'2011-4-2','2022-3-3');
insert into mag_subscription(user_id,mag_id,start_date,end_date) values(703,102,'2018-12-2','2021-5-21');

select * from mag_subscription ;

insert into magazine(mag_id,mag_name,genre) values(102,'VOUGE','FASHION');
insert into magazine(mag_id,mag_name,genre) values(101,'STONKS','BUSINESS');
insert into magazine(mag_id,mag_name,genre) values(103,'SPORTSTAR','SPORTS');

select * FROM magazine ;

INSERT INTO price(mag_id,price,months) values(101,51,9);
INSERT INTO price(mag_id,price,months) values(102,99,8);
INSERT INTO price(mag_id,price,months) values(103,151,9);

SELECT * from price p;

insert into users(user_id,
  user_name,
  user_password,
  mobile_no,
  email_id,
  age
 ) values(701,'Mark','abc',651321,'someone@avizva.com',21);

insert into users(user_id,
  user_name,
  user_password,
  mobile_no,
  email_id,
  age
 )  values(702,'Elon','elon',911321,'someone2@avizva.com',56);

insert into users(user_id,
  user_name,
  user_password,
  mobile_no,
  email_id,
  age
 )  values(703,'Tesla','tesla',786786,'someone3@avizva.com',41);

SELECT * from users u ;


insert into cart(cart_id,user_id,mag_id,price) values(101,701,103,151);
insert into cart(cart_id,user_id,mag_id,price) values(102,703,103,151);
insert into cart(cart_id,user_id,mag_id,price) values(103,702,101,51);

SELECT * from cart c ;

insert into payment(invoice_no,cart_id,date_of_payment ,mode_of_payment) values(1,101,'2021-9-20','EMI');
insert into payment (invoice_no,cart_id,date_of_payment ,mode_of_payment) values(2,102,'2021-9-18','CARD');
insert into payment (invoice_no,cart_id,date_of_payment ,mode_of_payment) values(3,103,'2021-9-19','NET_BANK');


SELECT * from payment ;

