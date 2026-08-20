create or replace function maximum(a int ,b int)
returns int
LANGUAGE plpgsql

as $$

DECLARE
m int;

begin
	
	if a>b then
	m:=a;
	else
	  m:=b;
	end if;
	
	return m;
	
end;

$$;

to run:-select maximum(5,3);