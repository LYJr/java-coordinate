package coordinate.domain;

import coordinate.util.InputException;
import coordinate.util.StringUtil;

import java.util.*;

public class CoordinatePlane {
    private static final int MAX = 25;
    private final int size;

    public CoordinatePlane() {
        this.size = MAX;
    }

    public int getSize() {
        return size;
    }

    public static List<Point> enterPoints(String input) throws IllegalArgumentException{
        List<Point> points = createPoint(input);
        Collections.sort(points);
        return points;
    }

    private static List<Point> createPoint(String input) throws IllegalArgumentException{
        List<Point> points = new ArrayList<>();
        String[] inputs = StringUtil.splitStringByDash(input);
        for (String s : inputs) {
            String[] point = StringUtil.splitStringByComma
                    (StringUtil.removeParentheses(s));
            points.add(Point.of(point[0], point[1]));
        }
        return points;
    }

    public Figure createFigure(List<Point> points) throws InputException {
        checkDuplicate(points);

        FigureMapper fm = new FigureMapper();
        return fm.getFigure(points);
    }

    private void checkDuplicate(List<Point> points) throws InputException{
        Set h = new HashSet();
        h.addAll(points);

        if(points.size() != h.size()) {
            throw new InputException("위치가 같은 점(Point)이 존재합니다. 각 점의 위치는 달라야 합니다.");
        }
    }
}