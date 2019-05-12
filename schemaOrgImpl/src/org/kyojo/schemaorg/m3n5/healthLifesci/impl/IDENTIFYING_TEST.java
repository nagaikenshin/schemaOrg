package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.BloodTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ImagingTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTestPanel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PathologyTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_TEST;

public class IDENTIFYING_TEST implements Container.IdentifyingTest {

	private static final long serialVersionUID = 1L;

	public List<BloodTest> bloodTestList;
	public List<ImagingTest> imagingTestList;
	public List<MedicalTest> medicalTestList;
	public List<MedicalTestPanel> medicalTestPanelList;
	public List<PathologyTest> pathologyTestList;

	public IDENTIFYING_TEST() {
	}

	public IDENTIFYING_TEST(String string) {
		this(new MEDICAL_TEST(string));
	}

	public String getString() {
		if(medicalTestList == null || medicalTestList.size() == 0 || medicalTestList.get(0) == null) {
			return null;
		} else {
			Name name = medicalTestList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalTestList == null) {
			medicalTestList = new ArrayList<MedicalTest>();
		}
		if(medicalTestList.size() == 0) {
			medicalTestList.add(new MEDICAL_TEST(string));
		} else {
			medicalTestList.set(0, new MEDICAL_TEST(string));
		}
	}

	public IDENTIFYING_TEST(BloodTest bloodTest) {
		bloodTestList = new ArrayList<BloodTest>();
		bloodTestList.add(bloodTest);
	}

	@Override
	public BloodTest getBloodTest() {
		if(bloodTestList != null && bloodTestList.size() > 0) {
			return bloodTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBloodTest(BloodTest bloodTest) {
		if(bloodTestList == null) {
			bloodTestList = new ArrayList<>();
		}
		if(bloodTestList.size() == 0) {
			bloodTestList.add(bloodTest);
		} else {
			bloodTestList.set(0, bloodTest);
		}
	}

	@Override
	public List<BloodTest> getBloodTestList() {
		return bloodTestList;
	}

	@Override
	public void setBloodTestList(List<BloodTest> bloodTestList) {
		this.bloodTestList = bloodTestList;
	}

	@Override
	public boolean hasBloodTest() {
		return bloodTestList != null && bloodTestList.size() > 0 && bloodTestList.get(0) != null;
	}

	public IDENTIFYING_TEST(ImagingTest imagingTest) {
		imagingTestList = new ArrayList<ImagingTest>();
		imagingTestList.add(imagingTest);
	}

	@Override
	public ImagingTest getImagingTest() {
		if(imagingTestList != null && imagingTestList.size() > 0) {
			return imagingTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImagingTest(ImagingTest imagingTest) {
		if(imagingTestList == null) {
			imagingTestList = new ArrayList<>();
		}
		if(imagingTestList.size() == 0) {
			imagingTestList.add(imagingTest);
		} else {
			imagingTestList.set(0, imagingTest);
		}
	}

	@Override
	public List<ImagingTest> getImagingTestList() {
		return imagingTestList;
	}

	@Override
	public void setImagingTestList(List<ImagingTest> imagingTestList) {
		this.imagingTestList = imagingTestList;
	}

	@Override
	public boolean hasImagingTest() {
		return imagingTestList != null && imagingTestList.size() > 0 && imagingTestList.get(0) != null;
	}

	public IDENTIFYING_TEST(MedicalTest medicalTest) {
		medicalTestList = new ArrayList<MedicalTest>();
		medicalTestList.add(medicalTest);
	}

	@Override
	public MedicalTest getMedicalTest() {
		if(medicalTestList != null && medicalTestList.size() > 0) {
			return medicalTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTest(MedicalTest medicalTest) {
		if(medicalTestList == null) {
			medicalTestList = new ArrayList<>();
		}
		if(medicalTestList.size() == 0) {
			medicalTestList.add(medicalTest);
		} else {
			medicalTestList.set(0, medicalTest);
		}
	}

	@Override
	public List<MedicalTest> getMedicalTestList() {
		return medicalTestList;
	}

	@Override
	public void setMedicalTestList(List<MedicalTest> medicalTestList) {
		this.medicalTestList = medicalTestList;
	}

	@Override
	public boolean hasMedicalTest() {
		return medicalTestList != null && medicalTestList.size() > 0 && medicalTestList.get(0) != null;
	}

	public IDENTIFYING_TEST(MedicalTestPanel medicalTestPanel) {
		medicalTestPanelList = new ArrayList<MedicalTestPanel>();
		medicalTestPanelList.add(medicalTestPanel);
	}

	@Override
	public MedicalTestPanel getMedicalTestPanel() {
		if(medicalTestPanelList != null && medicalTestPanelList.size() > 0) {
			return medicalTestPanelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTestPanel(MedicalTestPanel medicalTestPanel) {
		if(medicalTestPanelList == null) {
			medicalTestPanelList = new ArrayList<>();
		}
		if(medicalTestPanelList.size() == 0) {
			medicalTestPanelList.add(medicalTestPanel);
		} else {
			medicalTestPanelList.set(0, medicalTestPanel);
		}
	}

	@Override
	public List<MedicalTestPanel> getMedicalTestPanelList() {
		return medicalTestPanelList;
	}

	@Override
	public void setMedicalTestPanelList(List<MedicalTestPanel> medicalTestPanelList) {
		this.medicalTestPanelList = medicalTestPanelList;
	}

	@Override
	public boolean hasMedicalTestPanel() {
		return medicalTestPanelList != null && medicalTestPanelList.size() > 0 && medicalTestPanelList.get(0) != null;
	}

	public IDENTIFYING_TEST(PathologyTest pathologyTest) {
		pathologyTestList = new ArrayList<PathologyTest>();
		pathologyTestList.add(pathologyTest);
	}

	@Override
	public PathologyTest getPathologyTest() {
		if(pathologyTestList != null && pathologyTestList.size() > 0) {
			return pathologyTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPathologyTest(PathologyTest pathologyTest) {
		if(pathologyTestList == null) {
			pathologyTestList = new ArrayList<>();
		}
		if(pathologyTestList.size() == 0) {
			pathologyTestList.add(pathologyTest);
		} else {
			pathologyTestList.set(0, pathologyTest);
		}
	}

	@Override
	public List<PathologyTest> getPathologyTestList() {
		return pathologyTestList;
	}

	@Override
	public void setPathologyTestList(List<PathologyTest> pathologyTestList) {
		this.pathologyTestList = pathologyTestList;
	}

	@Override
	public boolean hasPathologyTest() {
		return pathologyTestList != null && pathologyTestList.size() > 0 && pathologyTestList.get(0) != null;
	}

	public IDENTIFYING_TEST(List<BloodTest> bloodTestList,
			List<ImagingTest> imagingTestList,
			List<MedicalTest> medicalTestList,
			List<MedicalTestPanel> medicalTestPanelList,
			List<PathologyTest> pathologyTestList) {
		setBloodTestList(bloodTestList);
		setImagingTestList(imagingTestList);
		setMedicalTestList(medicalTestList);
		setMedicalTestPanelList(medicalTestPanelList);
		setPathologyTestList(pathologyTestList);
	}

	public void copy(Container.IdentifyingTest org) {
		setBloodTestList(org.getBloodTestList());
		setImagingTestList(org.getImagingTestList());
		setMedicalTestList(org.getMedicalTestList());
		setMedicalTestPanelList(org.getMedicalTestPanelList());
		setPathologyTestList(org.getPathologyTestList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
