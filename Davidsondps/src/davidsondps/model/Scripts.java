/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.model;

/**
 *
 * @author Davidson
 */
public class Scripts {
    
    
    /**

        --
        -- Table structure for table `medico`
        --

        DROP TABLE IF EXISTS `medico`; 
        CREATE TABLE `medico` (
          `idMedico` int NOT NULL,
          `Nome` varchar(255) DEFAULT NULL,
          `Especialidade` int DEFAULT NULL,
          `Crm` int DEFAULT NULL,
          `Cpf` varchar(55) DEFAULT NULL,
          PRIMARY KEY (`idMedico`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
       
       --
        -- Table structure for table `consulta`
        --

        DROP TABLE IF EXISTS `consulta`;
        CREATE TABLE `consulta` (
          `idConsulta` int NOT NULL,
          `id_Medico` int DEFAULT NULL,
          `id_Paciente` int DEFAULT NULL,
          `Convenio` varchar(255) DEFAULT NULL,
          PRIMARY KEY (`idConsulta`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
        * 
        * --
        -- Table structure for table `paciente`
        --

        DROP TABLE IF EXISTS `paciente`;
        CREATE TABLE `paciente` (
          `idPaciente` int NOT NULL,
          `Nome` varchar(255) DEFAULT NULL,
          `Cpf` varchar(55) DEFAULT NULL,
          `Idade` int DEFAULT NULL,
          PRIMARY KEY (`idPaciente`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

        **/
}
