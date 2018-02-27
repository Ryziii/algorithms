<?php 
function swap(&$a,&$b){
	list($a,$b)=array($b,$a);
}
function bubbleSort(array $arr,$n){
	for($i=0;$i<$n;$i++){
		for ($j=$i+1; $j < $n; $j++) { 
			if($arr[$i]>$arr[$j]){
				swap($arr[$i],$arr[$j]);
			}
		}
	}
	return $arr;
}
$arr=array(8,5,11,4,33);
echo '<pre/>';
print_r(bubbleSort($arr,count($arr)));
//标记优化
function bubbleSort2(array $arr,$n){
	do {
		$swapped=0;
		for ($i=1; $i < $n; $i++) { 
			if($arr[$i-1]>$arr[$i]){
				swap($arr[$i-1],$arr[$i]);
				$swapped=1;
			}
		}
		$n--;
	} while ($swapped);
}
//标记最后一次交换
function bubbleSort3(array $arr,$n){
	do {
		$newn=0;
		for ($i=1; $i < $n; $i++) { 
			if($arr[$i-1]>$arr[$i]){
				swap($arr[$i-1],$arr[$i]);
				$newn=$i;
			}
		}
		$n=$newn;
	} while ($newn>0);
}