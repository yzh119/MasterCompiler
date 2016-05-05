package com.expye.compiler2016.Allocator;

import javax.crypto.Mac;
import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/4/28.
 */

/* 0    $0
 * 1    $at
 * 2    $v0
 * 3    $v1
 * 4    $a0
 * 5    $a1
 * 6    $a2
 * 7    $a3
 * 8    $t0
 * 9    $t1
 * 10   $t2
 * 11   $t3
 * 12   $t4
 * 13   $t5
 * 14   $t6
 * 15   $t7
 * 16   $s0
 * 17   $s1
 * 18   $s2
 * 19   $s3
 * 20   $s4
 * 21   $s5
 * 22   $s6
 * 23   $s7
 * 24   $t8
 * 25   $t9
 * 26   $k0
 * 27   $k1
 * 28   $gp
 * 29   $sp
 * 30   $fp
 * 31   $ra
 */
public class MachineRegister {
    public static MachineRegister[] virginRegister = new MachineRegister[]{
            new MachineRegister("$a3"),
            new MachineRegister("$t0"),
            new MachineRegister("$t1"),
            new MachineRegister("$t2"),
            new MachineRegister("$t3"),
            new MachineRegister("$t4"),
            new MachineRegister("$t5"),
            new MachineRegister("$t6"),
            new MachineRegister("$t7"),
            new MachineRegister("$s0"),
            new MachineRegister("$s1"),
            new MachineRegister("$s2"),
            new MachineRegister("$s3"),
            new MachineRegister("$s4"),
            new MachineRegister("$s5"),
            new MachineRegister("$s6"),
            new MachineRegister("$s7"),
            new MachineRegister("$t8"),
            new MachineRegister("$t9"),
            new MachineRegister("$k0"),
            new MachineRegister("$k1"),
            new MachineRegister("$fp"),
            new MachineRegister("$gp")
    };
    public static MachineRegister[] builtinArgRegister = new MachineRegister[]{
            new MachineRegister("$a0"),
            new MachineRegister("$a1"),
            new MachineRegister("$a2")
    };

    String name;
    private MachineRegister(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
