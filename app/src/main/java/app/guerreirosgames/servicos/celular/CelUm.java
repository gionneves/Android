package app.guerreirosgames.servicos.celular;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import app.guerreirosgames.R;


public class CelUm extends AppCompatActivity {


    public CheckBox td, tt, sprox, bt, wf, btn, btnp, car, autof, autofa, mic, camf, camt, conc, bat, bCover, dig, out;
    public AutoCompleteTextView marca, modelo;
    public String MaAntigo = "", MaNova = "";
    public String[] marcas = {"Samsung" , "Apple" , "Motorola" , "LG" , "Sony" , "Xiaomi" , "Huawei" , "LeNovo" , "Nokia" , "ASUS"};
    public ArrayAdapter<String> adapterMarcas;
    public String[] Lenovo = {"K53B36" , "K33B36 K6" , "K10A40 VIBE C2" , "A7010A48" , "A6020I36 VIBE K5" , "A2016B30 VIBE B"};
    public ArrayAdapter<String> adapterLenovo;
    public String[] Huawei = {"Y340" , "Y210-0251" , "U6020" , "SM80" , "OUTROS HUAWEI" , "MEU406" , "G510" , "AN500" , "AN351" , "AN350" , "AN200" , "AN 400"};
    public ArrayAdapter<String> adapterHuawei;
    public String[] Samsung = {"Galaxy A01" , "Galaxy A10" , "Galaxy A10s" , "Galaxy A11" , "Galaxy A20" , "Galaxy A20s" , "Galaxy A21s" , "Galaxy A30" , "Galaxy A30s" , "Galaxy A31" , "Galaxy A50" , "Galaxy A51" , "Galaxy A70" , "Galaxy A71" , "Galaxy A80" , "Galaxy A81" , "Galaxy M10" , "Galaxy M20" , "Galaxy M30" , "Galaxy M31" , "Galaxy S6" , "Galaxy S6 Edge" , "Galaxy S6 Edge+" , "Galaxy S7" , "Galaxy S7 Edge" , "Galaxy S8" , "Galaxy S8 Plus" , "Galaxy S9" , "Galaxy S9 Plus" , "Galaxy S10" , "Galaxy S10 Plus" , "Galaxy S10e" , "Galaxy S20" , "Galaxy S20 Plus" , "Galaxy S20 Ultra" , "Galaxy Note 5" , "Galaxy Note 7" , "Galaxy Note 8" , "Galaxy Note 9" , "Galaxy Note 10" , "Galaxy Note 10 Plus" , "Galaxy Note 10 Lite" , "Galaxy Note 20" , "Galaxy Note 20 Ultra" , "YP-G70CW" , "T499" , "SGH-T459" , "SGH-F250L" , "SGH-E215L" , "SGH-C260L" , "S7562L" , "S7560M" , "S7500 ACE PLUS" , "S7392L" , "S7390L" , "S7273T" , "S6810B" , "S6810B" , "S6802B" , "S6792L" , "S6313T" , "S6293" , "S6102B" , "S5830C" , "S5670" , "S5570" , "S5383" , "S5380B" , "S5367" , "S5360B" , "S5312B" , "S5303B" , "S5302B" , "S5301B" , "S5300B" , "S5283" , "S5282" , "S5250" , "S5230" , "S5222" , "S3850" , "S3650" , "S3500" , "S3350" , "S3333" , "S3313" , "S-9070" , "S-7582" , "S-7550" , "S-7262" , "S-6812" , "S-6790" , "S-6500D" , "S-5570b" , "S-5270" , "S-3332" , "S-3332" , "N920G" , "N910" , "N9005" , "N7502" , "N7100" , "N7000" , "M3710" , "M2710" , "M2510" , "M2310" , "J810 J8" , "J730G J7 PRO" , "J720 J7 DUO" , "J710 J7 METAL" , "J701 J7 NEO" , "J700M J7" , "J610 J6," , "J600GT J6" , "J530G J5 PRO" , "J510 J5 METAL" , "J500M J5" , "J415G J4," , "J410 J4 CORE" , "J400 J4" , "J327 J3 " , "J320M J3" , "J260 J2 CORE" , "J250M J2 PRO" , "J200M J2" , "J200 J2" , "J120H J1" , "J110L J1" , "J105M J1 MINI" , "J105B J1 MINI" , "J100M J1" , "I9515L" , "I9505" , "i9500" , "I9500" , "I9305" , "I9300i NEO" , "I9300" , "I9295" , "I9250" , "I9200" , "I9195" , "I9192" , "I9152" , "I9152" , "I9100" , "I9082L" , "I9070" , "I9063T " , "I9060" , "I9000B" , "I8750" , "I8730" , "I8552B" , "I8262B" , "I8200L" , "I8190L" , "I7390L" , "I6712" , "I6230" , "I6220" , "I5510" , "I5500B" , "I5500" , "I-9000" , "I-8160" , "I-8150B" , "I-677" , "GT7562" , "GT6812" , "GT5270" , "GT1207" , "GT-S6790L" , "GT-S5830C" , "GT-S5830B" , "GT-S5310B" , "GT-S3850" , "GT-S3650" , "GT-I9060L/DS" , "GT-E1260B" , "GT-E1205Y" , "GT-E1085" , "GT-C3510" , "GT-B7300B" , "G973 S10" , "G970 S10E" , "G955FD S8," , "G950FD S8" , "G935 S7 EDGE" , "G930 S7" , "G925I S6 EDGE" , "G920I S6" , "G9096" , "G900M" , "G900A" , "G900 S5" , "G850M" , "G800H" , "G7102T" , "G611 J7 PRIME 2" , "G610 J7 PRIME" , "G600FY" , "G570M J5 PRIME" , "G532 J2 PRIME" , "G531BT GRAN PRIME" , "G530-BT GRAN PRIME" , "G360 WIN 2" , "G357FZ" , "G355" , "G3502T" , "G3313T" , "G318ML" , "G316MDS" , "G313ML/DS" , "G130" , "G110B/DS" , "G110B" , "G-850M" , "G-3812B" , "F250L" , "F250" , "E700M E7" , "E500M" , "E3217B" , "E2550L" , "E2530" , "E250" , "E2262" , "E2222L" , "E2220" , "E2210L" , "E1265" , "E1263B" , "E1207" , "E1182L" , "E1086W" , "E-2330" , "E-1203" , "C3510" , "C3312" , "C3222" , "C3200" , "C276" , "C260L" , "C2104" , "C199" , "C101" , "C-6712" , "C-3313" , "B5722" , "B5510B" , "A920 A9" , "A910F" , "A720F" , "A710M" , "A705 A70" , "A700" , "A530 A8" , "A520F" , "A515F A51" , "A510M" , "A505 A50" , "A500M" , "A500" , "A315 A31" , "A30S" , "A307 A30S" , "A305 A30" , "A300M" , "A20S (A207M)" , "A207 A20S" , "A205 A20" , "A205" , "A107 A10S" , "A105 A10"};
    public ArrayAdapter<String> adapterSamsung;
    public String[] Apple = {"iPhone 4" , "iPhone 4s" , "iPhone 5" , "iPhone 5s" , "iPhone 5c" , "iPhone SE (1ª gen)" , "iPhone 6" , "iPhone 6 Plus" , "iPhone 6s" , "iPhone 6s Plus" , "iPhone 7" , "iPhone 7 Plus" , "iPhone 8" , "iPhone 8 Plus" , "iPhone X" , "iPhone XR" , "iPhone XS" , "iPhone XS Max" , "iPhone 11" , "iPhone 11 Pro" , "iPhone 11 Pro Max" , "iPhone SE (2ª gen)" , "iPhone 12" , "iPhone 12 Mini" , "iPhone 12 Pro" , "iPhone 12 Pro Max"};
    public ArrayAdapter<String> adapterApple;
    public String[] Motorola = {"XT2083 G9 PLAY" , "XT2045 G8" , "XT2015 G8 PLAY" , "XT2013 ONE ACTION" , "XT1965 G7" , "XT2019 G8 PLUS" , "XT1970 ONE VISION" , "XT1021/1022/1025 MOTO E" , "XT1033" , "MOTO Q" , "MILESTONE" , "MB502- CHARM" , "MB525 DEFY" , "MB886 ATRIX HD" , "ME525" , "ME811" , "MB526-DEFY," , "MB632 PRO," , "MB810 DROID X" , "MB855 PHOTON 4G" , "MB860 ATRIX" , "MOTO CUBO A45" , "XT1058 MOTO X" , "MOTOKEY EX112" , "MOTOKEY EX115" , "MOTOKEY SOCIAL" , "XT1032 MOTO G" , "MOTO Q11" , "MPX220" , "MZ505 XOOM FAMILY EDITION" , "MOTOQ 8" , "MZ601 XOOM-10,1POL" , "MZ603 XOOM-10,1POL" , "MZ605 XOOM-10,1POL" , "MZ607 XOOM 2-8,2POL" , "P8190" , "XT918/XT916 RAZR D1" , "XT919/XT920 RAZR D3" , "T182C" , "T190" , "T2260" , "T2290" , "T720" , "T720i" , "T731" , "T8060" , "T8090" , "U3" , "U6" , "U6C" , "U9" , "ULTRALITE" , "V120c" , "V120T" , "V150" , "V172" , "V173" , "V185" , "V186" , "V191" , "V195" , "V220" , "V220i" , "V2260" , "V2290" , "V235" , "V237" , "V260" , "V262" , "V265" , "V3" , "V3 BLACK" , "V3 GELATO" , "V300" , "V323" , "V360" , "V3620" , "V3690" , "V3c" , "V3e" , "V3g" , "V3i" , "V3iDOLCE&GABANA" , "V3M" , "V3RE" , "V3x" , "V3xx" , "V400" , "V400p" , "V500" , "V510" , "V555" , "V6" , "V600" , "V60c" , "V60ci" , "V60t" , "V60T COLOR" , "V60Ti" , "V635" , "V66" , "V66i" , "V70" , "V710" , "V750" , "V8" , "V810" , "V8160" , "V9" , "W175" , "W180" , "W215" , "W218" , "W220" , "W220i" , "W230" , "W231" , "W233" , "W270" , "W375" , "W388" , "W396" , "W403" , "W5" , "W510" , "W6" , "W7" , "W8" , "WX181" , "WX290" , "WX294" , "XT-300 SPICE" , "XT-301" , "XT303 MOTOSMART" , "XT2016 ONE MACRO" , "XT316 SPICE KEY" , "XT317 SPICE KEY" , "XT320 DEFY MINI" , "XT321 DEFY MINI" , "XT389 MOTOLUXE" , "MB220 DEXT" , "MB300 BACK FLIP" , "F3" , "EX440 MOTOGO DUAL CHIP" , "FLIPOUT MB511" , "K1" , "K1M" , "LITE II" , "MB200 CLIQ" , "EX440 MOTOGO DUAL CHIP" , "C168" , "EX430 MOTOGO" , "EX300" , "C364" , "EX117 MOTOKEY TRI-CHIP" , "EX118 MOTOKEY XT" , "EX122" , "EX128" , "EX132 MOTOSCREEN MINI" , "EX139 MOTOTV 2" , "EX210" , "EX225 MOTOKEY SOCIAL" , "EX226" , "EX245 MOTOTV" , "D1 ROKR" , "E2 ROKR" , "E310" , "E365" , "E380" , "E398" , "E8" , "E815" , "ELITE" , "EM25" , "XT1544 G3" , "EM30" , "EM35" , "EX108 MINI" , "DEFY" , "EX116 MOTOKEY WI-FI" , "XT2041 G8 POWER" , "C650" , "CHARM" , "C355" , "C357" , "C358" , "C155" , "A955 MILESTONE 2" , "AURA" , "C200" , "I450" , "C202" , "C210" , "C215" , "C261" , "C305" , "C331" , "C332" , "C333" , "C350" , "C353" , "C115" , "C139" , "C140" , "C141" , "XT-918" , "A3100" , "A388" , "XT2053 E6S" , "A853 MILESTONE" , "A855 MILESTONE" , "A953 MILESTONE 2" , "MZ608" , "A953" , "XT560" , "i876" , "XT532" , "EX119" , "I576" , "XT390" , "NEXTEL TITANIO" , "MZ615 XOOM 2-10,1POL" , "I867W" , "MZ616 XOOM 10,1POL" , "P8160" , "Q" , "Q9" , "QA1 KARMA" , "EX245" , "QUENCH MB501" , "XT531 /XT530 FIRE SPICE XT" , "XT560 DEFY PRO" , "XT610" , "XT682 ATRIX TV DUAL CHIP" , "XT687 ATRIX TV" , "XT800 MILESTONE" , "XT860 MILESTONE 3" , "XT890 RAZRi" , "XT-894 DROID 4" , "XT-905 RAZR M" , "XT915" , "XT-910 RAZR MAXX" , "XT-925 RAZR HD" , "EX112" , "XT-920" , "MB525" , "XT1025 MOTO E" , "i418" , "WX295" , "I940" , "MB501" , "XT1069 G2" , "XT1580 X FORCE" , "I680" , "XT1097 MOTO X2" , "XT1516 E2" , "XT1040 G" , "XT-916" , "XT1066 MOTO G2" , "XT1068 MOTO G2" , "XT1068 MOTO G2" , "XT1078 G2" , "XT1789 Z2" , "XT1563 X PLAY" , "FLONTAL" , "FLONTAL" , "XT1543 G3" , "XT1523 E2" , "XT1556 G3" , "XT1543 G3" , "XT1225 MAXX" , "XT1514 E2" , "TITANIUM" , "I296" , "XT1506 E2" , "XT1064 G2" , "XT1640 G4 PLUS" , "XT1635 Z PLAY" , "XT1635  Z PLAY" , "XT1603 G4 PLAY" , "XT1925 G6" , "XT1920 E5 PLAY" , "XT1941 ONE" , "XT1929 Z3 PLAY" , "XT1955 G7 POWER" , "XT1952 G7 PLAY" , "XT2010 ONE ZOOM" , "XT2025 E6 PLUS" , "XT1750 C" , "XT1900 X4" , "XT1944  E5" , "XT1924 E5 PLUS" , "XT1802  G5S PLUS" , "XT1763 E4" , "XT1926 G6 PLUS" , "XT1922 G6 PLAY" , "XT1922 G6 PLAY" , "XT1572 X STYLE" , "XT1763 E4" , "XT1726 C PLUS" , "XT1792 5S" , "XT1672 G5" , "XT1672 G5" , "XT1650 Z" , "XT1683 G5 PLUS" , "XT1773 E4 PLUS" , "XT1710 Z2 PLAY" , "XT1626 G4"};
    public ArrayAdapter<String> adapterMotorola;
    public String[] Xiaomi = {"REDMI NOTE 5A" , "REDMI S2" , "REDMI 5" , "REDMI NOTE 5 PRO" , "REDMI NOTE 6 PRO" , "REDMI 4X" , "REDMI 6A" , "REDMI NOTE 7" , "MI A2 LITE" , "MI A3" , "REDMI 9" , "REDMI GO" , "MI 9T/REDMI K20 PRO" , "REDMI 7A" , "REDMI NOTE 8 PRO" , "MI 9 M1902F1G" , "MI 9 LITE M1904F3BG" , "MI 8 LITE" , "MI 9 SE" , "REDMI NOTE 8"};
    public ArrayAdapter<String> adapterXiaomi;
    public String[] LG = {"X520 K12 MAX" , "X430BMW K40S" , "X410 K11," , "X350" , "X320 K4" , "X230 K4" , "X210 K9" , "X170 PRIME II" , "T375" , "T310" , "T300" , "T-500" , "P990" , "P970" , "P880" , "P875H" , "P768" , "P720" , "P716" , "P715" , "P714" , "P705" , "P700" , "P698" , "P696F" , "P655" , "P526" , "P500" , "P-350" , "MS770" , "MG810" , "MG160B" , "M320 K10 POWER" , "M250 K10" , "LM-X410" , "LG-B220A" , "L4" , "KP570" , "KF245" , "KF-755" , "KB775F" , "KB-775" , "K580" , "K500 XSCREEN" , "K430TV" , "K350 K8" , "K220 X POWER" , "K200 X STYLE" , "K200 K22" , "K170F TV" , "K130F" , "H522F" , "H502TV" , "H442" , "H422" , "H342F" , "H326TV" , "H326" , "H222" , "GU230" , "GT360" , "GT1600" , "GS290" , "GM600" , "GM600" , "GD330" , "GB230" , "E989" , "E980" , "E977" , "E960" , "E615F" , "E612F" , "E510F" , "E475F" , "E470F" , "E467F" , "E466F" , "E465F" , "E455F" , "E450F" , "E445" , "E435F" , "E425F" , "E415G" , "E415F" , "E410F" , "E405F" , "E400F" , "E300" , "D855P" , "D821" , "D820" , "D805" , "D724" , "D690N" , "D685" , "D618" , "D410H" , "D392D" , "D385" , "D337" , "D325F" , "D325F" , "D300F" , "D295F" , "D285" , "D227" , "D175F" , "D157F" , "D125F" , "D107F" , "D105F" , "D100F" , "C660H" , "C365" , "C333" , "C310" , "C300" , "C199" , "C1111" , "C105" , "C1000" , "C-299" , "BX7000 MOVIESHOT" , "BX6170 PRIME SHOT" , "BX5450 EASY SHOT" , "BL40" , "BL20" , "BD6070 LIFE" , "BD5130 LOOK" , "BD2330 FIT" , "BD2233 FLEX" , "BD2030" , "A395 QUAD CHIP" , "A290" , "A275" , "A270" , "A230" , "A190" , "A180" , "A175" , "A165" , "X420 K12"};
    public ArrayAdapter<String> adapterLG;
    public String[] Sony = {"Z3" , "Z2" , "Z1" , "XPERIA-X10" , "XPERIA T2" , "WT19A" , "W560i" , "W380" , "W205" , "W200" , "W150I" , "U20" , "T303" , "ST26A" , "ST25a" , "ST25" , "ST-26" , "SK-17" , "R-800" , "MT11" , "MT-15a" , "MK16A" , "LT26I" , "LT18a" , "LT18" , "LT15I" , "LT15" , "LT-22 i" , "F3216" , "F3116" , "F305" , "E5563 C5" , "E5343 C4" , "E5343" , "E2363" , "E2124" , "E10i" , "E-15" , "D6633" , "D5833 Z3 MINI" , "D5322" , "D5106" , "D2403" , "D2306" , "D2243" , "D2212" , "D2212" , "D2203" , "D2114" , "D2104" , "D2004" , "CE0682" , "C6943" , "C6843" , "C6503" , "C5303 " , "C2304" , "C2104" , "C2004" , "C2004" , "C1904" , "C1604" , "C1504"};
    public ArrayAdapter<String> adapterSony;
    public String[] Asus = {"ZX551ML" , "ZE620KL" , "ZE601KL" , "ZE552KL" , "ZE551" , "ZE520KL" , "ZD553KL" , "ZD552KL" , "ZD551KL" , "ZC553KL" , "ZC520TL" , "ZC520" , "ZC500TG" , "ZB634KL" , "ZB602KL" , "ZB570TL" , "ZB553KL" , "ZB551KL" , "ZB452KG"};
    public ArrayAdapter<String> adapterAsus;
    public String[] Nokia = {"Z1" , "X7" , "X6-00" , "X5-01" , "X3-02" , "X3-01" , "X3-00" , "X2-01" , "X2-00" , "X-840" , "X-100" , "X-01" , "WM545B" , "TR91" , "T733" , "SM70" , "SM55" , "SK351" , "SK-504" , "SK-402" , "SK-352" , "SC-452" , "SC-452" , "S5282" , "S5222" , "S-3332" , "RM-986" , "RM-979" , "RM-950" , "RM-1020" , "QW20" , "PREMIUM XS7010" , "PH7ETV" , "NP-RC420-SD1BR" , "N97-MINI" , "N97" , "N96" , "N9500" , "N95-3" , "N95 8GB" , "N95" , "N93I" , "N9300" , "N93" , "N92" , "N91" , "N900" , "N90" , "N9" , "N86" , "N85" , "N82" , "N810" , "N81 8GB" , "N81" , "N800" , "N80" , "N8-00" , "N79" , "N78 8GB" , "N77" , "N76" , "N75" , "N73" , "N71" , "N7000" , "N70-1" , "N1020" , "N GAGE" , "MOBO 3G 2050" , "LUMIA-930" , "LUMIA-730" , "LUMIA 930" , "LUMIA 925" , "LUMIA 920" , "LUMIA 900" , "LUMIA 830" , "LUMIA 820" , "LUMIA 800" , "LUMIA 730" , "LUMIA 720" , "LUMIA 710" , "LUMIA 640XL" , "LUMIA 640" , "LUMIA 630" , "LUMIA 625" , "LUMIA 620" , "LUMIA 610" , "LUMIA 535" , "LUMIA 532" , "LUMIA 530" , "LUMIA 520" , "LUMIA 435" , "LUMIA 1520" , "LUMIA 1320" , "LUMIA 1020" , "LT18a" , "INFOWAY ST4342" , "I9220" , "I9" , "I465" , "I440" , "G900F" , "G313M/DS" , "E90" , "E75" , "E72" , "E71" , "E70" , "E7-00" , "E66" , "E65-1" , "E65" , "E62" , "E61" , "E6-00" , "E52" , "E51" , "E50" , "E5-00" , "D50" , "D295F" , "C7-00" , "C5-03" , "C2-06" , "C2-05" , "C2-03" , "C2-02" , "C2-01" , "C2-00" , "C1504" , "C1-01" , "C-3" , "ASPIRE ONE D255-2032" , "ASHA 501" , "ASHA 311" , "ASHA 310" , "ASHA 308" , "ASHA 305" , "ASHA 303" , "ASHA 302" , "ASHA 300" , "ASHA 230" , "ASHA 205" , "ASHA 202" , "ASHA 201" , "ASHA 200" , "ASHA 200" , "ASHA" , "AN351" , "969" , "9500" , "846" , "8280I" , "8280" , "8265I" , "8265" , "8260" , "8210" , "808 PUREVIEW" , "7710" , "7650" , "7610 SUPERNOVA" , "7610" , "7510S" , "7500" , "7373" , "7370" , "7310S" , "7310" , "7270" , "7260" , "7250I" , "7250" , "7230" , "7210S" , "7210" , "7200" , "7160" , "7100S" , "710.1 " , "7020" , "7020" , "701" , "6822" , "6820" , "6760" , "6730" , "6720C" , "6710" , "6700 SLIDE" , "6700 CLASSIC" , "6681" , "6681" , "6680" , "6670" , "6630" , "6610" , "6600" , "6585" , "6560" , "6555" , "6510" , "6500 SLIDE" , "6500 CLASSIC" , "6303" , "6303" , "6300" , "6280" , "6275" , "6270" , "6267" , "6265" , "6260" , "6255" , "6235" , "6230" , "6225I" , "6225" , "6220" , "6210N" , "6200" , "620" , "6180I" , "6180" , "6170" , "6165" , "6155" , "6125" , "6121" , "6120 CLASSIC" , "6120" , "6111" , "6110" , "6103" , "6102" , "6101" , "6100" , "6085" , "6070" , "6060" , "6030" , "6012" , "5800" , "5730" , "5700" , "5610" , "5530" , "5320" , "5310" , "5300" , "530" , "5235" , "5233" , "5230" , "5220" , "5200" , "520" , "5180" , "5140" , "5130" , "5125" , "5120" , "5120" , "501" , "500" , "3710" , "3660" , "3650" , "3600" , "3586" , "3555" , "3530" , "3520" , "3510" , "3320" , "3310N" , "3310" , "3125" , "3120C" , "3120" , "3110" , "311" , "3105" , "305" , "302" , "2610" , "2323" , "2220 SLIDE " , "205" , "202" , "201.2" , "1208" , "0507G"};
    public ArrayAdapter<String> adapterNokia;

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            controleDaPressao();
                        }
                    });
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });
    ArrayList<String> defeitos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel_um);

        marca = findViewById(R.id.celUm_Marca);

        adapterMarcas = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , marcas);
        marca.setThreshold(1);
        marca.setAdapter(adapterMarcas);

        t.start();
    }

    public void controleDaPressao() {
        marca = findViewById(R.id.celUm_Marca);
        //----------------------.*
        MaNova = marca.getText().toString();
        if (MaNova.equals(MaAntigo)) {

        } else {
            branchSelected(MaNova);
            MaAntigo = MaNova;
        }

    }

    public void branchSelected(String branch) {

        marca = findViewById(R.id.celUm_Marca);
        modelo = findViewById(R.id.celUm_Modelo);
        //---------------------------------.*
        //branch = marca.getText().toString();
        branch = branch.toLowerCase();
        //-----------------------------------.*

        if (branch.equals("samsung")) {
            modelo = findViewById(R.id.celUm_Modelo);
            modelo.setHint("Galaxy A01; Galaxy S10; ...");
            adapterSamsung = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Samsung);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterSamsung);

        } else if (branch.equals("apple")) {
            modelo.setHint("iPhone XR; iPhone 8 Plus; ...");
            adapterApple = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Apple);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterApple);

        } else if (branch.equals("motorola")) {
            modelo.setHint("Moto G8; Moto X; ...");
            adapterMotorola = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Motorola);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterMotorola);

        } else if (branch.equals("lg")) {
            modelo.setHint("K10; K61; Q6; ...");
            adapterLG = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , LG);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterLG);

        } else if (branch.equals("sony")) {
            modelo.setHint("");
            adapterSony = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Sony);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterSony);

        } else if (branch.equals("xiaomi")) {
            modelo.setHint("Redmi 7A; Mi 8 Pro; ...");
            adapterXiaomi = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Xiaomi);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterXiaomi);

        } else if (branch.equals("huawei")) {
            modelo.setHint("P30; P40; P40 pro; ...");
            adapterHuawei = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Huawei);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterHuawei);

        } else if (branch.equals("lenovo")) {
            modelo.setHint("");
            adapterLenovo = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Lenovo);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterLenovo);

        } else if (branch.equals("nokia")) {
            modelo.setHint("3311; 3301; Lumia; ...");
            adapterNokia = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Nokia);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterNokia);

        } else if (branch.equals("asus")) {
            modelo.setHint("Zenfone; ");
            adapterAsus = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , Asus);
            modelo.setThreshold(1);
            modelo.setAdapter(adapterAsus);

        } else {
            modelo.setText("");
            modelo.setHint("");
        }

    }

    public void onCheckboxCliked(View view) {
        boolean checked = ((CheckBox) view).isChecked();


        switch (view.getId()) {
            case R.id.celUm_TelaDisplay: // tela display.*
                td = findViewById(R.id.celUm_TelaDisplay);
                if (checked) {
                    td.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    td.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tela_display));
                } else {
                    td.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    td.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tela_display));

                }
                break;

            case R.id.celUm_TelaTouch: // tela Touch.*
                tt = findViewById(R.id.celUm_TelaTouch);
                if (checked) {
                    tt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    tt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tela_touch));


                } else {
                    tt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    tt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tela_touch));


                }
                break;

            case R.id.celUm_SensorProx: // Sensor de proximidade.*
                sprox = findViewById(R.id.celUm_SensorProx);
                if (checked) {
                    sprox.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    sprox.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.sensor_de_proximidade));


                } else {
                    sprox.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    sprox.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.sensor_de_proximidade));


                }
                break;

            case R.id.celUm_Bluetooth: // Bluetooth.*
                bt = findViewById(R.id.celUm_Bluetooth);
                if (checked) {
                    bt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.bluetooth));


                } else {
                    bt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.bluetooth));


                }
                break;

            case R.id.celUm_WiFi: // Wi-Fi.*
                wf = findViewById(R.id.celUm_WiFi);
                if (checked) {
                    wf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    wf.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.wi_fi));


                } else {
                    wf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    wf.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.wi_fi));

                }
                break;

            case R.id.celUm_Botoes_MaMe: // Botões de volume.*
                btn = findViewById(R.id.celUm_Botoes_MaMe);
                if (checked) {
                    btn.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    btn.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.botoes_volume));

                } else {
                    btn.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    btn.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.botoes_volume));

                }
                break;

            case R.id.celUm_Botao_Power: // Botão POWER.*
                btnp = findViewById(R.id.celUm_Botao_Power);
                if (checked) {
                    btnp.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    btnp.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.botao_power));

                } else {
                    btnp.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    btnp.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.botao_power));

                }
                break;

            case R.id.celUm_Carcaca: // Carcaça do aparelho.*
                car = findViewById(R.id.celUm_Carcaca);
                if (checked) {
                    car.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    car.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.carca_a));

                } else {
                    car.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    car.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.carca_a));

                }
                break;

            case R.id.celUm_AutoFalante: // Auto falante.*
                autof = findViewById(R.id.celUm_AutoFalante);
                if (checked) {
                    autof.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    autof.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.auto_falante));

                } else {
                    autof.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    autof.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.auto_falante));

                }
                break;

            case R.id.celUm_AutoFalanteAuricular: // Auto falante auricular.*
                autofa = findViewById(R.id.celUm_AutoFalanteAuricular);
                if (checked) {
                    autofa.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    autofa.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.auto_falante_auricular));


                } else {
                    autofa.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    autofa.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.auto_falante_auricular));

                }
                break;

            case R.id.celUm_Microfone: // microfone.*
                mic = findViewById(R.id.celUm_Microfone);
                if (checked) {
                    mic.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    mic.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.microfone));

                } else {
                    mic.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    mic.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.microfone));

                }
                break;

            case R.id.celUm_CameraFrontal: // câmera Frontal.*
                camf = findViewById(R.id.celUm_CameraFrontal);
                if (checked) {
                    camf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    camf.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.c_mera_frontal));

                } else {
                    camf.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    camf.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.c_mera_frontal));

                }
                break;

            case R.id.celUm_CameraTraseira: // câmera traseira.*
                camt = findViewById(R.id.celUm_CameraTraseira);
                if (checked) {
                    camt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    camt.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.c_mera_traseira));

                } else {
                    camt.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    camt.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.c_mera_traseira));

                }
                break;

            case R.id.celUm_ConectorCarga: // Conector de carga.*
                conc = findViewById(R.id.celUm_ConectorCarga);
                if (checked) {
                    conc.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    conc.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.conector_de_carga));

                } else {
                    conc.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    conc.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.conector_de_carga));

                }
                break;

            case R.id.celUm_Bateria: // Bateria.*
                bat = findViewById(R.id.celUm_Bateria);
                if (checked) {
                    bat.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bat.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.bateria));

                } else {
                    bat.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bat.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.bateria));

                }
                break;

            case R.id.celUm_TampaTraseira: // Traseira.*
                bCover = findViewById(R.id.celUm_TampaTraseira);
                if (checked) {
                    bCover.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    bCover.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.tampa_traseira));

                } else {
                    bCover.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    bCover.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.tampa_traseira));

                }
                break;

            case R.id.celUm_Digital: // DIGITAL.*
                dig = findViewById(R.id.celUm_Digital);
                if (checked) {
                    dig.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder_full)));
                    dig.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.digital));

                } else {
                    dig.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.green_holder)));
                    dig.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.digital));

                }
                break;

            case R.id.celUm_Outros: // Outros.*
                out = findViewById(R.id.celUm_Outros);
                if (checked) {
                    out.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.blue_holder_full)));
                    out.setTextColor(getColor(R.color.white));

                    defeitos.add(getString(R.string.outrosOp));

                } else {
                    out.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.blue_holder)));
                    out.setTextColor(getColor(R.color.black));

                    defeitos.remove(getString(R.string.outrosOp));

                }
                break;
            default:

                break;
        }

    }

    public void close(View view) {
        finish();
    }

    public void next(View view) {
        Intent intent = new Intent(this , CelDois.class);
        modelo = (AutoCompleteTextView) findViewById(R.id.celUm_Modelo);


        //-----------------------------------------------.*

        intent.putExtra("CELUM_MODELO" , modelo.getText().toString());
        intent.putExtra("CELUM_MARCA" , MaNova);

        intent.putStringArrayListExtra("CELUM_DEFEITOS" , defeitos);

        //------------------------------------------------.*


        startActivity(intent);

    }

}




