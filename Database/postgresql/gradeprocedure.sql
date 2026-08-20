create or replace procedure add_student(trno int,tname varchar(23),tper float)
language plpgsql
as $$
declare grade varchar(19);
begin
	
    select count(*) from student where rno=trno;

    if count =1 then
    raise notice 'Record is existed for roll number %',trno;
    
   elsif tper>=80 then
 grade :='first class';

elsif tper>=70 then
 grade:='distinction';

elsif tper>=60 then
grade:='second class';

else 
grade:='pass';

end if ;

insert into student values(trno,tname,tper,grade);

end ;
$$;

