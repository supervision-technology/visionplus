/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.util.database.annotation.VPId;
import com.sv.visionplus.util.database.annotation.VPTable;

/**
 *
 * @author KAZA
 */
@VPTable("bank_branch")
public class MBankBranch {

    @VPId
    private String code;
    private String bank;
    private String branch;

    public MBankBranch() {
    }

    public MBankBranch(String code, String bank, String branch) {
        this.code = code;
        this.bank = bank;
        this.branch = branch;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return code + "-" + bank + "-" + branch;
    }
}
