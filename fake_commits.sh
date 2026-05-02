#!/bin/bash

FILE="activity.txt"
YEAR=2026

for DAY in {2..13}
do
    COMMITS=$((1 + RANDOM % 4))

    for ((i=1; i<=COMMITS; i++))
    do
        HOUR=$((10 + RANDOM % 10))
        MIN=$((RANDOM % 60))

        DATE=$(printf "%04d-05-%02dT%02d:%02d:00" $YEAR $DAY $HOUR $MIN)

        echo "Commit on $DATE" >> $FILE

        git add .

        GIT_AUTHOR_DATE="$DATE" \
        GIT_COMMITTER_DATE="$DATE" \
        git commit -m "DSA practice - May $DAY"
    done
done
