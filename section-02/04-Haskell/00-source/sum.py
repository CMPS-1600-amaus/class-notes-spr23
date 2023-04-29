def list_sum(lst):
    if(len(lst) == 0):
        return 0
    if(len(lst) == 1):
        return lst[0]
    return lst[0] + list_sum(lst[1:])