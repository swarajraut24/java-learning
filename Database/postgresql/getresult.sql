create or replace function getresult(rn int)
returns varchar
language plpgsql
as $$
 declare marks int;
begin 

select per into marks from student where rno =rn;

	if marks>60 then 
	 return 'pass';
	else 
	return 'fail';
end if;
end ;
$$;
