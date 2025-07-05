/*==================================================================
  Tabela       : TB_USER
  Propósito    : Armazenar dados básicos de usuários
==================================================================*/

-- Criar tabela
CREATE TABLE TB_USER (
  ID        NUMBER(19)     NOT NULL,
  NAME      VARCHAR2(255)  NOT NULL,
  EMAIL     VARCHAR2(255),
  DOCUMENT  VARCHAR2(20)   NOT NULL,
  CONSTRAINT PK_USER PRIMARY KEY (ID)
    USING INDEX TABLESPACE USERS,
  CONSTRAINT UK_USER_DOCUMENT UNIQUE (DOCUMENT)
);

-- Criar sequência
CREATE SEQUENCE SQ_USER
  START WITH 1
  INCREMENT BY 1
  MINVALUE 1
  NOCYCLE
  CACHE 20
  NOORDER;

  -- Carga de dados (1000 registros)
  BEGIN
  FOR i IN 1..1000 LOOP
    INSERT INTO TB_USER (ID, NAME, EMAIL, DOCUMENT)
    VALUES (
      SQ_USER.NEXTVAL,
      'User_' || TO_CHAR(i),
      'user' || TO_CHAR(i) || '@example.com',
      LPAD(i, 8, '0')
    );
  END LOOP;
  COMMIT;
  END;