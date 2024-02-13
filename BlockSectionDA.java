import java.io.*;
import java.util.*;
public class BlockSectionDA {
    private List<BlockSection> blockSectionList;
    public List<BlockSection> getBlockSectionList() {
        return blockSectionList;}

    public BlockSectionDA() throws FileNotFoundException {
        blockSectionList = new ArrayList<>();

        Scanner blockSectionFile = new Scanner(new FileReader("blockSection.csv"));

        while (blockSectionFile.hasNext()){
            BlockSection blockSection = new BlockSection();
            String blockSectionRaw = blockSectionFile.nextLine();
            String[] blockSectionArray = new String[2];
            blockSectionArray = blockSectionRaw.split(",");

            blockSection.setBlockCode(blockSectionArray[0].trim());
            blockSection.setDescription(blockSectionArray[1].trim());
            blockSection.setAdviser(blockSectionArray[2].trim());
            Integer totalStudents = 0;
           
            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());

            for(Student student: studentDA.getStudentList()){
                totalStudents++;
                blockSection.setTotalStudents(totalStudents);
            }

            blockSection.setStudentList(studentDA.getStudentList());

            blockSectionList.add(blockSection);
        } blockSectionFile.close();
    }
    }

