
//we cannot use void in sql thats why we use procedure

delimiter $$
create procedure message()
 
begin
	select 'hello world';
end $$
delimiter ;

to call procedure:-call message();


