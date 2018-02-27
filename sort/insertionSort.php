<?php 
function swap(&$a,&$b){
	list($a,$b)=array($b,$a);
}
function insertionSort($arr,$n){
	for ($i=1; $i<$n; $i++) { 
		for ($j=$i; $j>0&&$arr[$j]<$arr[$j-1]; $j--) { 
			swap($arr[$j],$arr[$j-1]);
		}
	}
	return $arr;
}
$arr=array(1,2,112,22,32,123,3321);
echo '<pre/>';
print_r(insertionSort($arr,count($arr)));