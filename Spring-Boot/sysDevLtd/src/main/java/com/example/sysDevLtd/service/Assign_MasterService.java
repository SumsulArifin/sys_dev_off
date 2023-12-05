package com.example.sysDevLtd.service;

import com.example.sysDevLtd.entity.model.AssignDetails;
import com.example.sysDevLtd.entity.model.Assign_Master;
import com.example.sysDevLtd.utils.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Assign_MasterService {
    public Assign_Master saveAssign_Master(Assign_Master assign_master);
    public List<Assign_Master> getAllAssign_Master();
    public Assign_Master findAssign_MasterById(int a_M_Id);
    public void deleteAssign_MasterById(int a_M_Id);
}
