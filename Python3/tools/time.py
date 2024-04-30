import time

def executionTime(func, parameters: list=None, type: str="ms"):
    if callable(func):
        start = time.time()
        time.sleep(1)
        if parameters is not None:
            func(*parameters)
        else:
            func()
        end = time.time()
        return (end - start) * 1000 if type == "ms" else (end - start) if type == "s" else (end - start) / 60
        