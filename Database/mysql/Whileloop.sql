delimiter $$
create function sumofn(n int)
returns int
deterministic


begin
  Declare ans int default 0;
  Declare i int default 1;

while i<=n
 do
   set ans=ans+i;
   set i=i+1;
end while;

return ans;

end $$
delimiter ;