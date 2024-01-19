--
-- PostgreSQL database dump
--

-- Dumped from database version 14.10 (Homebrew)
-- Dumped by pg_dump version 14.10 (Homebrew)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: contacts; Type: TABLE; Schema: public; Owner: taavi
--

CREATE TABLE public.contacts (
    id integer NOT NULL,
    full_name character varying(255) NOT NULL,
    code_name character varying(255) NOT NULL,
    phone_number character varying(20) NOT NULL
);


ALTER TABLE public.contacts OWNER TO taavi;

--
-- Name: contacts_id_seq; Type: SEQUENCE; Schema: public; Owner: taavi
--

CREATE SEQUENCE public.contacts_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contacts_id_seq OWNER TO taavi;

--
-- Name: contacts_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: taavi
--

ALTER SEQUENCE public.contacts_id_seq OWNED BY public.contacts.id;


--
-- Name: contacts id; Type: DEFAULT; Schema: public; Owner: taavi
--

ALTER TABLE ONLY public.contacts ALTER COLUMN id SET DEFAULT nextval('public.contacts_id_seq'::regclass);


--
-- Data for Name: contacts; Type: TABLE DATA; Schema: public; Owner: taavi
--

COPY public.contacts (id, full_name, code_name, phone_number) FROM stdin;
15	Taavi Toomsalu	taavi007	54 685 987
16	Siiri Sisask	siiri567	34 986 467
17	John Doe	john007	786 674 789
18	Elmar Vaher	elmut678	87 589 456
19	Kaja Kallas	kaja_littlebunny	112
20	Pille Ülle	pilleylle12	45 678 456
\.


--
-- Name: contacts_id_seq; Type: SEQUENCE SET; Schema: public; Owner: taavi
--

SELECT pg_catalog.setval('public.contacts_id_seq', 20, true);


--
-- Name: contacts contacts_pkey; Type: CONSTRAINT; Schema: public; Owner: taavi
--

ALTER TABLE ONLY public.contacts
    ADD CONSTRAINT contacts_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

