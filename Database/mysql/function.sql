delimiter $$
create function maximum(a int,b int)
returns int
deterministic 
begin
Declare  
   m int;
if a>b then
 set m=a;
else 
  set m=b;
end if;

  return m;

	end $$
delimiter ;