from typing import List, Dict, Optional

#https://fastapi.tiangolo.com/es/python-types/
#https://docs.pydantic.dev/
#https://mypy.readthedocs.io/en/latest/cheat_sheet_py3.html

def process_items(items: List[str]):
    for item in items:
        print(item)

def process_items(prices: Dict[str, float]):
    for item_name, item_price in prices.items():
        print(item_name)
        print(item_price)

def say_hi(name: Optional[str] = None):
    if name is not None:
        print(f"Hey {name}!")
    else:
        print("Hello World")