PGDMP                      |            db_productos    16.3    16.3 	    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16396    db_productos    DATABASE     �   CREATE DATABASE db_productos WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Argentina.1252';
    DROP DATABASE db_productos;
                postgres    false            �            1259    16406 	   productos    TABLE     �   CREATE TABLE public.productos (
    id integer NOT NULL,
    nombre text NOT NULL,
    cantidad integer NOT NULL,
    precio_compra integer NOT NULL,
    precio_venta integer NOT NULL
);
    DROP TABLE public.productos;
       public         heap    postgres    false            �            1259    16405    db_productos_idProductos_seq    SEQUENCE     �   ALTER TABLE public.productos ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."db_productos_idProductos_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    216            �          0    16406 	   productos 
   TABLE DATA           V   COPY public.productos (id, nombre, cantidad, precio_compra, precio_venta) FROM stdin;
    public          postgres    false    216   7	       �           0    0    db_productos_idProductos_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public."db_productos_idProductos_seq"', 5, true);
          public          postgres    false    215            Q           2606    16412    productos db_productos_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.productos
    ADD CONSTRAINT db_productos_pkey PRIMARY KEY (id);
 E   ALTER TABLE ONLY public.productos DROP CONSTRAINT db_productos_pkey;
       public            postgres    false    216            �      x�3�,H��4�450�40������ .��     