create or replace  procedure mesg()
language plpgsql
as $$

declare x int :=20;
begin
	raise notice 'Value of x:%',x;
end ;
$$;

call mesg();