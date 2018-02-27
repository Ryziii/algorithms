<?php 
function swap(&$a,&$b){
	list($a,$b)=array($b,$a);
}
function selectionSort(array $arr,$n){
	for ($i=0; $i < $n; $i++) { 
		$minIndex=$i;
		for ($j=$i+1; $j < $n; $j++) { 
			if($arr[$j]<$arr[$minIndex]){
				$minIndex=$j;
			}
		}
		swap($arr[$i],$arr[$minIndex]);
	}
	return $arr;
}
$arr=array(8,5,11,4,33);
echo '<pre/>';
print_r(selectionSort($arr,count($arr)));