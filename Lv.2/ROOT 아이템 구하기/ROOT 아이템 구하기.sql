SELECT II.ITEM_ID, II.ITEM_NAME
FROM ITEM_INFO AS II, ITEM_TREE AS IT
WHERE II.ITEM_ID = IT.ITEM_ID AND IT.PARENT_ITEM_ID IS NULL;