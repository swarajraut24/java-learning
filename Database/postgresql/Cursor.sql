create or replace procedure show_student()
language plpgsql
as $$
declare 
       stud_cur cursor for select rno,name,per from student;
declare
       stud_rec RECORD;

begin
	  open stud_cur;
	  Loop
		  fetch stud_cur into stud_rec;
          exit when not found ;
   raise notice 'Roll no:%   Name:%   per:%',stud_rec.rno,stud_rec.name,stud_rec.per;  	
	  end loop;
close stud_cur;
	  
end;
$$;