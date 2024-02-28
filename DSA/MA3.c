//Siddharth Bhagwat 53
#include "c8051F340.h"
#define LED P4
sbit key1 = P1^0
sbit key2 = P1^1
sbit relay = P1^4
sbit buzzer = P3^3

void main
{
    XBR1 = Ox40;
    P1MDIN = 0x03;
    P3MDOUT = 0x08;
    P1MDOUT = 0x10;
    P4MDOUT = 0xFF;

while (1)
{
    if (key1 = 0)
    {
        while(1)
        {
            LED = 0x00;
            relay = 0;
            buzzer = 1;
            if (key2==0)

            {
                break;
            }
        }
    }
    if (key2 == 0)
    {
        while(1)
        {
            LED = 0xff;
            relay = 1;
            buzzer = 0;
            if (key1==0)
            {
                break;
            }
        }
}
}
}
