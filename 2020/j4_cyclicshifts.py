T = input()
S = input()
ans = "no"
for i in range(len(S)):
    if S in T:
        ans = "yes"
        break
    S = S[-1] + S[:1]  # last item in the list + second item in the list
print(ans)