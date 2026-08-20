delimiter $$


create  procedure mesg()
deterministic
begin
	declare x int;
set x=0;

select concat('value:',x);
end $$;
delimiter;