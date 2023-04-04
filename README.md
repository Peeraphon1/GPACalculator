# GPACalculator
เป็นโปแกรมคำนวณ GPA ของคน 1 คน ที่ต้องการคำนวณเกรดของตนเอง โดยใส่เกรดที่ได้แต่ละวิชากับจำนวนหน่วยกิต เมื่อใส่ครบก็กดคำนวณได้เลย
## วิธีการติดตั้งโปรแกรม 
สิ่งที่ต้องมี 
1. InteliJ IDEA
2. JDK


### การติดตั้ง InteliJ IDEA
1.ดาวน์โหลดตัวติดตั้ง IntelliJ IDEA Community Edition โดยเข้าไปที่เว็บไซต์
https://www.jetbrains.com/idea/download/#section=windows (Ultimate เสียเงิน , Community Edition ฟรี)
![image](https://user-images.githubusercontent.com/127968005/229813739-0d8bfa52-3a39-4197-b213-3a1ac4ab6120.png)

2.เมื่อโหลดเสร็จ ดับเบิ้ลคลิกไฟล์ที่โหลดแล้วกดติดตั้งให้เรียบร้อย

### การติดตั้ง JDK
ในส่วนของ JDK สามารถติดตั้งผ่าน InteliJ IDEA ได้โดยเราจะบอกในส่วนการใช้งานโปรแกรม


## วิธีการใช้งานโปรแกรม 
#### 1.เมื่อโหลด InteliJ IDEA เสร็จ กด New project
#### 2.เมื่อกด New project จะมีให้ใส่ตามนี้
![image](https://user-images.githubusercontent.com/127968005/229815643-f0428cdc-a1b5-4be5-a84b-358dd191559c.png)
#### 3.ใส่ชื่อโปรเจคตามที่ต้องการ เลือก Location ตามที่ต้องการ เลือก ภาษา JAVA และส่วนของ JDK ถ้ายังไม่มีก็สามารถกดโหลดเวอร์ชันที่ต้องการได้เลย เมื่อเรียบร้อยกด Create
![image](https://user-images.githubusercontent.com/127968005/229815999-9cfd83df-e449-4f9c-9a1d-f6cab8a64a7a.png)
#### 4.เมื่อทำตามขั้นตอนที่แล้วต่อมาจะได้โฟล์เดอร์ SRC คลิกขวาที่ โฟล์เดอร์ SRC -> new ->File เสร็จแล้วตั้งชื่อว่า GPACalculator.java
#### 5.นำ Source code ในโฟล์เดอร์ SRC ใน Github(GPACalculator.java) มาวาง
![image](https://user-images.githubusercontent.com/127968005/229816676-45c4e01c-761b-409e-995d-746e80f89ef8.png)
#### 6.กด RUN ทางขวาบนลูกศร สีเขียว
#### 7..เมื่อกด รัน จะได้หน้านี้
![image](https://user-images.githubusercontent.com/127968005/229816864-6557fd3a-14ef-4c9d-bab2-a279705f9a2e.png)



#### โดย 
Course : คือชื่อวิชาของเรา จะใส่หรือไม่ก็ได้          
Grade : คือเกรดที่เราได้ หรือ คาดว่าจะได้ 
Credit : คือหน่วยกิตของวิชานั้นๆ
Add : คือการ Add course กับ Credit เข้าไปในตารางข้างบน
Edit: การแก้ไข Course Credit Grade ได้เมื่อใส่ข้อมูลลงในตารางแล้วต้องการแก้ไข
Delete : ลบวิชาที่เลือกนั้นๆออกจากตาราง
Calculate : คือเมื่อเราพิมวิชา เกรด กับหน่วยกิตครบ เมื่อกดปุ่ม Calculate ก็จะคำนวณ GPA ออกมา


## ตัวอย่างการใช้งานโปรแกรม
#### Add
เมื่อเรา พิมชื่อวิชา,เลือกเกรด,พิมหน่วยกิต และกดปุ่ม Add โดยถ้าไม่ใส่หน่วยกิตโปรแกรมจะไม่ทำงานและขึ้นข้อความเตือนให้ใส่หน่วยกิต แต่สามารถไม่ใส่ชื่อวิชาได้



![image](https://user-images.githubusercontent.com/127968005/229818094-d1d9a1ef-b7d8-4601-8da6-be6e41948281.png)




วิชาที่เราใส่ก็จะถูกเพิ่มไปในตาราง


#### Edit
เมื่อเราต้องการแก้ไข เกรด วิชา หรือ หน่วยกิตในแต่ละวิชาที่เราได้ Add ไปและอยู่ในตารางแล้ว สามารถทำได้โดยกดปุ่ม Edit
ในที่นี้เราต้องการแก้ จาก วิชา Science เปลี่ยนเป็นวิชา English เราก็กดเลือกวิชาที่ต้องการแก้ไข และกดปุ่ม Edit



![image](https://user-images.githubusercontent.com/127968005/229818828-d13a8340-fbc5-4533-a50e-8b4ee6a7b5aa.png)



เมื่อเรากดปุ่ม Edit แล้ว เราก็สามารถแก้ได้หมด ในที่นี้จะแก้จาก Science B+ และหน่วยกิต3 เป็น English A และหน่วยกิต 2
เมื่อเราพิมเสร็จ ก็กด Edit อีกครั้ง



![image](https://user-images.githubusercontent.com/127968005/229819941-fe309714-9d1e-4c96-b2db-1c8f4a7d6880.png)




ผลลัพธ์ก็ถูกแก้ไข เป็นที่เรียบร้อย


![image](https://user-images.githubusercontent.com/127968005/229820175-5c5e8a69-04e0-49c0-847a-f62fe42a9774.png)


#### Delete
เราต้องการลบวิชาที่ Add ไปในตาราง ก็กดเลือกวิชานั้นและกดปุ่ม Delete ได้เลย


#### Calculate
เมื่อพิมวิชา,เลื่อกเกรด,พิมหน่วยกิต ครบทั้งหมดแล้ว สามารถกด Calculate ได้เลย โดยโปรแกรมก็จะคำนวณ GPA ของเราออกมาโชว์เป็นผลลัพธ์




![image](https://user-images.githubusercontent.com/127968005/229820962-3c00a4b3-c985-4168-ad83-71c753b69dee.png)








