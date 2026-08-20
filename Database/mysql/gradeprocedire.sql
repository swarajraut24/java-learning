delimiter $$
create procedure add_student(trno int,tname varchar(23),tper double)
deterministic

begin
declare grade varchar(34);
declare cnt int;

 select count(*) into cnt from student where rno=trno;

    if cnt =1 then
   select concat('Record is existed for roll number',trno);
    
   elseif tper>=80 then
 set grade ='first class';

elseif tper>=70 then
 set grade='distinction';

elseif tper>=60 then
set grade='second class';

else 

set grade='pass';

end if ;

insert into student values(trno,tname,tper,grade);


end $$;
delimiter ;