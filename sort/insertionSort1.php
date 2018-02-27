<?php 
function swap(&$a,&$b){
	list($a,$b)=array($b,$a);
}
function insertionSort($arr,$n){
	for ($i=1; $i<$n; $i++) { 
		$e=$arr[$i];
		for ($j=$i; $j>0&&$e<$arr[$j-1]; $j--) { 
			$arr[$j]=$arr[$j-1];
		}
		$arr[$j]=$e;
	}
	return $arr;
}
$arr=array(1,2,112,22,32,123,3321);
echo '<pre/>';
print_r(insertionSort($arr,count($arr)));