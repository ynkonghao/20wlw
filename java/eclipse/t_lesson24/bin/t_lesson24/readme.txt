Set和List的区别

List是按照添加元素的顺序进行存储的，List是有序的,List可以添加重复的元素，由于List是有序的，所以可以使用get(index)来获取值
Set存储的方式是原始的hash码，所以Set存储的值是无序的,Set不能添加重复的元素，由于Set是无序的，所以Set无法使用get(index)来获取值
Set的遍历需要使用Iterator,不管是Set还是List都可以使用Iterator进行遍历。

Iterator的注意事项
Iterator迭代器为列表提供了一种统一的遍历方案，但是使用Iterator有一些需要注意点，不能在遍历的过程中移除元素，
由于增强的for循环使用的核心就是Iterator，所以使用增强的for循环遍历元素时，也不能移除元素。