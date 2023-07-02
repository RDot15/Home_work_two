# Task 22

from random import randint
# Подключаю библиотеку

# list_1 = [randint(0, 10) for _ in range(int(input('Введите размер первого набора чисел:  ')))]
# list_2 = [randint(0, 10) for _ in range(int(input('Введите размер второго набора чисел:  ')))]
# print(list_1)
# print(list_2)

# set_unique_first = set(list_1)
# set_unique_second = set(list_2)
# # set1.intersection(set2,set3,set4...)
# #   # сточник: https://pythononline.ru/osnovy/metod-set-intersection-v-python-i-primery
# array = (set_unique_first.intersection(set_unique_second))
# print(array)

#----------------------------------------------------------------------------------------------------

#Task 24

number_tree = int(input(' количество кустов:  '))
list_1 = [randint(0, 100) for _ in range(number_tree)] # 0 - куст погиб. > 0 плодоносит
# урожайность кустов рандомная
print(list_1)
max_summ = 0
for i in range (number_tree):
    if max_summ < list_1[0] + list_1[1] + list_1[2]: # робот собирает макс кол-во. 
        max_summ = list_1[0] + list_1[1] + list_1[2]
    list_1.insert(0, list_1.pop()) # вставляем 0 на последнее значение. последнее удаляем
print(max_summ)



