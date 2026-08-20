create or replace function sumof(n int)
returns int
language plpgsql
as $$

DECLARE
ans int;
i int ;

begin
	ans := 0;
   i := 1;

while i<=n 

LOOP
 ans := ans+i;
i := i+1;

END LOOP;

return ans;

end;
$$
