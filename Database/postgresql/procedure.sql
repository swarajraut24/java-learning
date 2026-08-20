create or replace procedure mesg()
language plpgsql
as $$
begin 
	raise notice 'hello world';
end $$;

to call a procedure:-call mesg();

