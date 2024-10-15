package org.invopayWebService.repository.backupList;

import org.invopayWebService.entity.TableBackup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TableBackupRepository extends JpaRepository<TableBackup, Integer>,
    JpaSpecificationExecutor<TableBackup> {

}