<?php 
function swap(&$a,&$b){
	list($a,$b)=array($b,$a);
}
$a=1;
$b=22;
echo $a.' '.$b.'<br/>';
swap($a,$b);
echo $a.' '.$b.'<br/>';
