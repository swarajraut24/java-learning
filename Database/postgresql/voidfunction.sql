
create or replace function message()
returns void
language plpgsql
as $$
begin 
	raise notice 'hello world';
end;
$$;

end