n = int(input())
x, y = [], []
for i in range(n):
    x_num, y_num = input().split(',')
    x.append(int(x_num))  # add x_num to the list of x-coordinates
    y.append(int(y_num))  # add y_num to the list of y-coordinates
print(f"{min(x)-1}, {min(y)-1}")  # print the smallest x,y coordinates
print(f"{max(x)+1}, {max(y)+1}")  # print the biggest x,y coordinates

# print('{},{}'.format(x, y)

