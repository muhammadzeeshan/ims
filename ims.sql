CREATE TABLE Academic (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Academic_Program (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Academic_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Academic_Program_FKIndex2(Academic_id)
);

CREATE TABLE Academic_Program_Course (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Academic_Program_id INTEGER UNSIGNED NOT NULL,
  Course_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Academic_Course_FKIndex2(Course_id),
  INDEX Academic_Program_Course_FKIndex2(Academic_Program_id)
);

CREATE TABLE Business_Data (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Business_Data_Reference_id INTEGER UNSIGNED NOT NULL,
  User_Role_Screen_Element_id INTEGER UNSIGNED NOT NULL,
  value1 VARCHAR(255) NULL,
  PRIMARY KEY(id),
  INDEX Business_Data_FKIndex1(User_Role_Screen_Element_id),
  INDEX Business_Data_FKIndex2(Business_Data_Reference_id)
);

CREATE TABLE Business_Data_Reference (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR NULL,
  PRIMARY KEY(id)
);

CREATE TABLE Business_Fields (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Collection (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Collection_Mode_id INTEGER UNSIGNED NOT NULL,
  Institute_Branch_Tenure_User_id INTEGER UNSIGNED NOT NULL,
  Duration_Type_id INTEGER UNSIGNED NOT NULL,
  Collection_Status_id INTEGER UNSIGNED NOT NULL,
  Collection_Setup_Data_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Collection_FKIndex2(Collection_Setup_Data_id),
  INDEX Collection_FKIndex4(Collection_Status_id),
  INDEX Collection_FKIndex7(Duration_Type_id),
  INDEX Collection_FKIndex6(Institute_Branch_Tenure_User_id),
  INDEX Collection_FKIndex5(Collection_Mode_id)
);

CREATE TABLE Collection_Mode (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Collection_Reference (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Collection_Setup_Data (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Collection_Reference_id INTEGER UNSIGNED NOT NULL,
  Collection_Type_id INTEGER UNSIGNED NOT NULL,
  Duration_Type_id INTEGER UNSIGNED NOT NULL,
  collection_reference_field_id INTEGER UNSIGNED NULL,
  start_date DATE NULL,
  last_date DATE NULL,
  amount INTEGER UNSIGNED NULL,
  PRIMARY KEY(id),
  INDEX Collection_Setup_Data_FKIndex1(Duration_Type_id),
  INDEX Collection_Setup_Data_FKIndex2(Collection_Type_id),
  INDEX Collection_Setup_Data_FKIndex3(Collection_Reference_id)
);

CREATE TABLE Collection_Status (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Collection_Type (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Course (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Duration_Type (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Institute (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Institute_Branch (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Institute_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institution_Branch_FKIndex1(Institute_id)
);

CREATE TABLE Institute_Branch_Academic_Program (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Institute_Branch_id INTEGER UNSIGNED NOT NULL,
  Academic_Program_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institute_Branch_Academic_Program_FKIndex1(Academic_Program_id),
  INDEX Institute_Branch_Academic_Program_FKIndex2(Institute_Branch_id)
);

CREATE TABLE Institute_Branch_Module (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Module_id INTEGER UNSIGNED NOT NULL,
  Institute_Branch_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institute_Module_FKIndex1(Institute_Branch_id),
  INDEX Institute_Module_FKIndex2(Module_id)
);

CREATE TABLE Institute_Branch_Tenure (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Tenure_id INTEGER UNSIGNED NOT NULL,
  Institute_Branch_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institute_Branch_Tenure_FKIndex1(Institute_Branch_id),
  INDEX Institute_Branch_Tenure_FKIndex2(Tenure_id)
);

CREATE TABLE Institute_Branch_Tenure_User (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Institute_Branch_Tenure_id INTEGER UNSIGNED NOT NULL,
  Users_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institute_User_FKIndex1(Users_id),
  INDEX Institute_Branch_Tenure_User_FKIndex2(Institute_Branch_Tenure_id)
);

CREATE TABLE Institute_Branch_User_Academic_Program (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Tenure_Academic_Program_Course_id INTEGER UNSIGNED NOT NULL,
  Institute_Branch_Tenure_User_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Institute_Branch_User_Academic_Program_FKIndex1(Institute_Branch_Tenure_User_id),
  INDEX Institute_Branch_User_Academic_Program_FKIndex2(Tenure_Academic_Program_Course_id)
);

CREATE TABLE Module (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Module_Screen (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Module_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Module_Screen_FKIndex1(Module_id)
);

CREATE TABLE Module_Screen_Element (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Business_Fields_id INTEGER UNSIGNED NOT NULL,
  Module_Screen_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Module_Screen_Element_FKIndex1(Module_Screen_id),
  INDEX Module_Screen_Element_FKIndex2(Business_Fields_id)
);

CREATE TABLE Permission (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Role (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Role_Type_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Role_FKIndex1(Role_Type_id)
);

CREATE TABLE Role_Institute_Branch_Module (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Institute_Branch_Module_id INTEGER UNSIGNED NOT NULL,
  Role_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Role_Institute_Branch_Module_FKIndex1(Role_id),
  INDEX Role_Institute_Branch_Module_FKIndex2(Institute_Branch_Module_id)
);

CREATE TABLE Role_Type (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Rule (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Tenure (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Tenure_Academic_Program_Course (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Institute_Branch_Tenure_id INTEGER UNSIGNED NOT NULL,
  Academic_Program_Course_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Tenure_Academic_Course_FKIndex2(Academic_Program_Course_id),
  INDEX Tenure_Academic_Program_Course_FKIndex3(Institute_Branch_Tenure_id)
);

CREATE TABLE Transaction (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Transaction_Type_Detail_id INTEGER UNSIGNED NOT NULL,
  Collection_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Transaction_FKIndex1(Collection_id),
  INDEX Transaction_FKIndex2(Transaction_Type_Detail_id)
);

CREATE TABLE Transaction_Type (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE Transaction_Type_Detail (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Transaction_Type_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX Transaction_Type_Detail_FKIndex1(Transaction_Type_id)
);

CREATE TABLE Users (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  PRIMARY KEY(id)
);

CREATE TABLE User_Profile (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  User_Role_Screen_Element_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX User_Profile_FKIndex2(User_Role_Screen_Element_id)
);

CREATE TABLE User_Role_Institute_Branch_Module (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Role_Institute_Branch_Module_id INTEGER UNSIGNED NOT NULL,
  Institute_Branch_Tenure_User_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX User_Role_FKIndex1(Institute_Branch_Tenure_User_id),
  INDEX User_Role_FKIndex2(Role_Institute_Branch_Module_id)
);

CREATE TABLE User_Role_Screen_Element (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Rule_id INTEGER UNSIGNED NOT NULL,
  Permission_id INTEGER UNSIGNED NOT NULL,
  Module_Screen_Element_id INTEGER UNSIGNED NOT NULL,
  User_Role_Institute_Branch_Module_id INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(id),
  INDEX User_Role_Screen_Element_FKIndex1(User_Role_Institute_Branch_Module_id),
  INDEX User_Role_Screen_Element_FKIndex2(Module_Screen_Element_id),
  INDEX User_Role_Screen_Element_FKIndex3(Permission_id),
  INDEX User_Role_Screen_Element_FKIndex4(Rule_id)
);


